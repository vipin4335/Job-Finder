
#Core Features:
1. Home Page: A welcome interface with navigation links.
2. Job Posting Form: A form page (addjob) that collects job details like ID, profile, description, experience, and tech stack. Data binding with JobPost objects allows direct population from form data.
3. Form Handling: The handleForm method accepts a JobPost object for submission handling, storing job data for later retrieval or display.
4. Data Display: Predefined job data can be set in the controller for views to simulate a database, displaying available job listings.

#Technologies Used:
1. Spring MVC and Spring Boot: For handling web requests, views, and data binding.
2. JSP and JSTL: For dynamic content rendering and form data handling in the frontend.
3. Bootstrap 5: CSS styling and layout for a responsive, modern user interface.
4. Model Binding: Directly binds form data to Java objects, streamlining data flow between the client and server.

Dependencies
1. Tomcat Jasper (org.apache.tomcat:tomcat-jasper:10.1.30)
2. JSTL API (jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:3.0.2)
3. JSTL Implementation (org.glassfish.web:jakarta.servlet.jsp.jstl)
4. Spring Boot Starter Web (org.springframework.boot:spring-boot-starter-web)
5. Lombok (org.projectlombok:lombok)

