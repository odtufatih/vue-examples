
* This is a basic monolithic vue-js spring-boot application example.

### Steps For Local

* First create the spring-boot application using https://start.spring.io/ and 
  adding web and devtools as dependencies. Import the spring boot project into your IDE(Intellij).
  
* Navigate to the src folder from the terminal and run the command <font color="blue">vue create frontend</font>
NodeJs must already be installed for this command to execute. When the command is executed the frontend
  project will be generated in the src/frontend folder.
  
* Navigate to /src/frontend and run the application. <font color="blue">npm run serve</font>

* Edit the vue.config.js file and add port and proxy configuration for front end application to run on port 3000.
This port will be used in local only, frontend application will run as a seperate process on port 3000 and NodeJs. 
  Any request that starts with  /api will be forwarded to http://localhost:8180 due to our configuration.

* Start the spring boot application on port 8180
  
* <font color="blue">npm run serve</font> command will run the NodeJs application on localhost:3000.
The message will be retrieved from the backend spring boot application.
  

### Production

* In production we can build the vuejs application into the spring boot application
and deploy as a single jar. We can use frontend-maven-plugin and maven-resources-plugin plugins for this.
  
* <font color="blue">npm run build</font> command builds the vue project and produces index.html and static files
in the folder src/frontend/dist. Then we copy these files to target/classes/static. Building the the spring boot 
  project with <font color="blue">mvn clean package</font> command
  handles these steps by executing the plugins. 
  
* Run the spring boot application

java -jar target/vue-springboot-basic-example-0.0.1-SNAPSHOT.jar

* Go to http://localhost:8180 from the browser and page will be displayed with the welcome message.






