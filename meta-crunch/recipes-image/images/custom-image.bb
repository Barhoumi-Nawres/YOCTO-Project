DESCRIPTION = "Custom image to integrate the crunch app"
SUMMARY = "${DESCRIPTION}"
LICENSE = "CLOSED"

inherit core-image
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_FEATURES = "allow-empty-password allow-root-login debug-tweaks empty-root-password"

IMAGE_INSTALL:append = " crunch"

IMAGE_CLASSES += "qemuboot"
