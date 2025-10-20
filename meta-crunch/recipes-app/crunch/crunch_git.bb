DESCRIPTION = " Recipe for crunch application"
SUMMARY = " ${DESCRIPTION}"
LICENSE = "CLOSED"
HOMEPAGE = "https://github.com/pri1311/crunch"
SECTION = "apps"

SRC_URI = "git://github.com/pri1311/crunch.git;protocol=https;branch=master"

SRC_URI += " file://crunch-main-socketio-config.patch \
             file://app.service \
           "


SRCREV = "6a80aa45ab70bf20d0748c74e04c04ffd6b202d8"

S ="${WORKDIR}/git"


DEPENDS = "python3 python3-pip"

inherit systemd 
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "app.service"


#Runtime dependencies 
RDEPENDS:${PN} += "\
    python3 \
    python3-sqlite3 \
    python3-bidict \
    python3-certifi \
    pip-cloudinary \
    python3-flask \
    python3-flask-login \
    python3-flask-socketio \
    python3-flask-sqlalchemy \
    python3-sqlalchemy \
    python3-socketio \
    python3-jinja2 \
    python3-werkzeug \
    python3-itsdangerous \
    python3-click \
    python3-six \
    python3-urllib3 \
    python3-certifi \
    python3-markupsafe \
    python3-gunicorn \
    python3-engineio \
    python3-socketio \	
"




do_install (){
   install -d -m 0755 ${D}/opt/crunch
   install -d ${D}${systemd_system_unitdir}
   chmod +x ${S}/*
   chmod +x ${S}/website/*
   cp -r ${S}/* ${D}/opt/crunch  
   install -m 0644 ${WORKDIR}/app.service ${D}${systemd_system_unitdir}/
}

FILES:${PN} += "/opt/crunch/*"
FILES:${PN} += "${systemd_system_unitdir}/app.service"
