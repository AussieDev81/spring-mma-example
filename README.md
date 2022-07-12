# Spring Multi-Module Application Example

To run this application
- IntelliJ: Run the [preconfigured run configuration](.run/Spring multi-module example.run.xml)
- NetBeans/VSCode: Build the module jars then run the [main class](web/src/main/java/com/example/App.java)  in the web module


## Modules
### [web](web "Go to module")
The main web driver service for this application, it is responsible for serving web pages (if served from the backend) and REST endpoints to be consumed by frontend services.
### [entity](entity "Go to module")
Essentially a storage space for entity model classes. The entity classes outline application wide objects and their relational database mapping. 
### [repository](repository "Go to module")
Home to entity repositories including any specific JPA queries and/or methods.
### [service](service "Go to module")
Contains application services that define most of the app's operational logic.

For example a `Student Service` might contain logic to perform CRUD operations for a Student, while an `Enrolment Service` may enroll/unenroll a Student into classes.
___
Each of these modules are application in their own right, each having their own `pom.xml` file and `jar` artifact which could easily be split into standalone microservices