This application is a basic User Management System built using Spring Core , Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations such as creating, viewing, updating, and deleting users through a web interface.
## Project Structure
 **src/main/java: Contains your Java code.**
- org.youcode.controller: Holds the controller classes to manage incoming requests and direct them to the appropriate services or views.
- org.youcode.domain: Likely contains your domain models, such as Membre.
- org.youcode.repository: This is where your data access logic resides, most likely Spring Data repositories.
- org.youcode.service: Contains service layer classes for business logic, interacting between the repository and controller.
**src/main/resources:**
- applicationContext.xml: Central configuration file for Spring, likely defining beans, database configurations, and service layers.
**src/main/webapp:**
- WEB-INF/views: Contains JSP files. In this case, listMembers.jsp is the view for displaying a list of members.
- dispatcher-servlet.xml: Configures Spring MVC's DispatcherServlet, handling web requests and directing them to appropriate controllers and views.
- web.xml: Configures the servlet mapping, pointing to your DispatcherServlet.
**pom.xml: Maven build file managing dependencies and project configuration.**

## Technologies Used
-**Spring Core: Dependency Injection**
-**Spring Data: Data source configuration and data handling**
-**Spring MVC: Presentation layer**
-**PostgreSQL: Database**
-**Apache Tomcat: Web server**

## Project Setup
- **Java JDK 17**
- **Apache Tomcat Server**
- **PostgreSQL Database**
- **Maven**
