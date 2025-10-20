# YOCTO-Project
The project consists of developing a layer for a ***Flask Chat Server application*** .


### Project Goals:
1. Create a new layer  for the crunch project named meta-crunch
2. Create a recipe for crunch named: crunch_git.bb
3. Integrate all python runtime dependencies:

a. Hint: check requirements.txt of the crunch project

4. Create a custom distro to enable systemd
5. Create a systemd service to run the flask application at boot
6. Apply the MIT license of the crunch project
7. Create a custom image based on core-image-minimal to integrate the crunch app
8. Test the application

### The application link:
[crunch](https://github.com/pri1311/crunch#)


### Python runtime dependencies :
- Add them using the variable <code>RDEPENDES</code> 


### Test 

<code>-MACHINE= "qemux86-64"</code>


### Layer Dependencies:
This layer depends on 
- <code>meta-python</code> 


### To generate python package automatically using pip2Bitbake :
 steps :
1. install pip3 on development machine :
  <code>sudo apt-get -y install python-pip</code>
2. Clone the Repository 
 
  <code>git clone https://github.com/robseb/PiP2Bitbake.git</code>


3. Start the python script :

  <code> python3 makePipRecipes.py



4. On the script put the package name/License of the package
 
### Test the application without systemd  service:

Use this command :<code>python3 main.py</code>

![command-test](screenshot/test1-app.png) 

### Test with service systemd :
![service-test](screenshot/service-test.png)

### Application :
![app-test](screenshot/app.png)
![app-test](screenshot/app2.png)

#### Links can help you :

 [Yocto recipe for python application](https://stackoverflow.com/questions/54080551/how-to-install-dependencies-from-requirements-txt-in-a-yocto-recipe-for-a-local)

 [Kas-container with Qemu](https://www.marcusfolkesson.se/blog/kas-container-and-qemu/)

 [pip2bitbake](https://github.com/robseb/PiP2Bitbake)

 [package cloudinary](https://pypi.org/search/?q=cloudinary)


- This project is for educational purposes.

### Credits :
- A special thanks to [@bhstalel](https://github.com/TechLeef) for making this project for Techleef community.
