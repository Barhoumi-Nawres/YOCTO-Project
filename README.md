# YOCTO-Project
The project consists of developing a layer for a Flask Chat Server application


### Steps:
- Create a new layer  for the crunch project named meta-crunch
- Create a recipe for crunch named: crunch_git.bb
- Integrate all python runtime dependencies:

a. Hint: check requirements.txt of the crunch project

- Create a custom distro to enable systemd
- Create a systemd service to run the flask application at boot
- Apply the MIT license of the crunch project
- Create a custom image based on core-image-minimal to integrate the crunch app
- Test the application

The application link:
[crunch](https://github.com/pri1311/crunch#)


Python runtime dependencies :
- Add them using the variable RDEPENDES 







Links may can help you :
[Yocto recipe for python application](https://stackoverflow.com/questions/54080551/how-to-install-dependencies-from-requirements-txt-in-a-yocto-recipe-for-a-local)
