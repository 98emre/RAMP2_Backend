# RAMP2_Backend
We have developed a web application that processes an XML file containing instructions for RAMP 2, 
which is an assessment tool designed for a detailed analysis and evaluation of ergonomic risk factors related to manual material handling tasks. 
These tasks can increase the risk of musculoskeletal disorders. Manual material handling includes activities such as lifting, pushing, or pulling objects manually.
Prolonged or frequent exposure to these risk factors can increase the likelihood of developing or exacerbating musculoskeletal disorders.

## Java Installation Guide
We used the programming language Java

### Step 1: Download Java
First download latest version of [Java](https://www.oracle.com/java/) to install.

### Step 2: Verify Installation
Open a new command prompt (or terminal) and type:

```bash
java --version
```
This should display Java's version, indicating a successful installation.

## Maven Installation Guide

### Step 1: Download Maven
First download the latest version of [Maven](https://maven.apache.org/download.cgi).

### Step 2: Installed Maven
Extract the downloaded file to a suitable location on your computer.

### Step 3: Add Maven To Path
To run Maven in your command line, you need to add Maven bin in your system `PATH` variable.

´Windows` : 
1. Right click on `This PC` and choose `Properties`.
2. Click on `Advanced system settings`.
3. Click on `Environment Variables`.
4. Under System Variables, locate `PATH` and click `Edit`.
5. Click `New` and add the path to Maven's bin.

Mac:
Add the following line to your .bashrc, .bash_profile, or .zshrc, depending on your shell:
```bash
export PATH=$PATH:/path/to/maven/bin
```
Replace /path/to/maven with the actual path where you extracted Maven.

### Step 4: Verify Installation
Open a new command prompt (or terminal) and type:

```bash
mvn --version
```

This should display Maven's version, indicating a successful installation.

## Spring boot
We utilized the Spring Boot framework to manage our database and handle our REST APIs.
You can create your Spring Boot project directly on their [website](https://start.spring.io/).

## Database

- A relational database management system (RDBMS) supporting SQL, suggestively [PostgreSQL](https://www.postgresql.org/)
- We used the tool [DBeaver](https://dbeaver.io/), which allowed us to view relationships, tables, and values within the tables.

## Dependencies in your application.properties file

Make sure all you have all of the following dependencies in your pom.xml file and use the latest version:
- spring-boot-starter
- spring-boot-starter-data-jpa
- spring-boot-starter-actuator
- spring-boot-starter-web
- spring-boot-starter-test
- spring-boot-devtools
- springdoc-openapi-starter-webmvc-ui
- hibernate-validator
- spring-boot-starter-validation
- spring-security-core
- spring-boot-starter-security
- postgresql (make sure to change this dependency in case you use another relational database management system)
- lombok
    
As well as verifying that your maven plugin version exists and is not later than your installed maven version.
  
In the application.properties file, to configure to your database, set your environment variables alternatively set them explicitly:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/ramp2
spring.datasource.username=${POSTGRES_USERNAME}
spring.datasource.password=${POSTGRES_PASSWORD}
```

When mapping and seeding the database and running the application for the first time, make sure this property is set to create:
```
spring.jpa.hibernate.ddl-auto=create
```

When mapping and seeding is completed set the property to update:
```
spring.jpa.hibernate.ddl-auto=update
```

In the application.properties file, to configure to your keylcoak, set your environment variables alternatively set them explicitly:
```
keycloak.realm=${KEYCLOAK_REALM}
keycloak.client-id=${KEYCLOAK_CLIENT_ID}
keycloak.token-endpoint=${KEYCLOAK_TOKEN_ENDPOINT}
```

In the application.properties file, to configure to spring security with JWT,
```
jwt.auth.app=Spring-Security
jwt.auth.secret_key=denmyckethemligakodensomduintefarberattaom
jwt.auth.expires_in=3600
```

In the application.properties file, to configure custom server port make sure this property is set to create:
```
server.port:8081 (You can change it)
```


## Usage
The application will run on port 8081 and default is 8080. 
If another port would be desired, this can be set in the application.properties file.

## Testing with Postman
Postman is a popular tool for testing APIs. It allows you to send requests to your API and view responses in a user-friendly interface.

### Step 1: Install Postman
Download and install Postman from [Postman's official website](https://www.postman.com/).

### Step 2: Send Requests

With Postman open, you can send requests to the Lagalt API. For example, to retrieve all users on the platform, set the request type to "GET" and enter the endpoint URL: `http://localhost:8081/api/users/public`.

You can also add headers, body data, and other request parameters as needed for different endpoints.

### Step 3: Ramp 2 Endpoints
Further down you can find all our endpoints for the application that you can use

### API Endpoints
| HTTP Verbs | Endpoints | Action |
| --------- | --------- | --------- |
| **Authentication** | | |
| POST | /api/auth/login | Login with a user |
| POST | /api/auth/addUser | Create a user |
| **Checklist** | | |
| POST | /api/checklist/addList | To create a new checklist |
| GET | /api/checklist/public | To retrieve all projects on the platform |
| GET | /api/checklist/user/:id | To retrieve all checklist from a user |
| GET | /api/checklist/:id  | Retrieves a single checklist by id |
| GET | /api/checklist/searchIdName/:id/:userid | To retrieve checklist by id name from a user |
| GET | /api/checklist/:projectId/collaborators/all-pending | Project owner, can see all request to the project |
| PUT | /api/checklist/updateList | To edit/update  the details of a single checklist |
| **Actionplan** | | |
| POST | /api/actionplan | To create a new comment on a specific project |
| GET | /api/actionplan | To retrieve all action plan on the platform |
| GET | /api/actionplan/:id | To retrieve a singe action plan by id |
| GET | /api/actionplan/user/:id | To retrieve all action plan from a user |
| GET | /api/actionplan/search/:id_name/:userid | To retrieve action plan by id name from a user |
| PUT | /api/actionplan/:commentId/update | To edit/update  the details of a single action plan |


# Author
Emre Demirel @98emre
