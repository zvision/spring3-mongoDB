Simpel Spring Boot projekt som läser rest-tjänsten (https://jsonplaceholder.typicode.com/posts) och skriver datat till en MongoDB  

- Spring Boot 3.2.2  
- Java 17
 

Hur/vad göra
============

- Att bygga: mvn clean package </br> 
- Att köra:  mvn spring-boot:run    (java -jar target\spring3-mongoDB-0.0.1-SNAPSHOT.jar) </br>


Endpoints
---------

GET </br>
- curl http://localhost:8080/api/v1/posts load all posts </br>
- curl http://localhost:8080/api/v1/posts/{n}  load specific "n" number of posts </br>


Databas 
========

Name:   mydata </br>
Driver: MongoDB </br>
URL:	jdbc:mongodb://localhost:27017 </br>