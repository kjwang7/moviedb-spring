# Movie DB with RESTful front end

This is a Spring application for a movie database with a hypermedia-based RESTful front end.

This application is built using Spring Boot, JPA and H2, following the guide: https://spring.io/guides/gs/accessing-data-rest/

Each movie in the database has an ​id ​(long), ​name (varchar), ​rating​ from 1 to 10 (int), and a ​description​ (varchar).

### Import as a Maven project

### Run the application

./mvnw spring-boot:run

### Create a new movie:

curl -i -H "Content-Type:application/json" -d '{"id": "1", "name": "Cat", "rating": "2", "description": "Cartoon"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "2", "name": "Rain", "rating": "5", "description": "Story"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "3", "name": "Star wars", "rating": "3", "description": "Fiction"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "4", "name": "Lion King", "rating": "6", "description": "Cartoon"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "5", "name": "Titanic", "rating": "1", "description": "Story"}' http://localhost:8080/movies

### See all the movie records:

curl http://localhost:8080/movies

### Query individual movie by ID:

curl http://localhost:8080/movies/1

### Query movie by name:

curl http://localhost:8080/movies/search/findByName?name=Cat

### Replace/Add movie record:

curl -X PUT -H "Content-Type:application/json" -d '{"id": "2", "name": "Rain", "rating": "2", "description": "Story"}' http://localhost:8080/movies/2

### Update movie information:

curl -X PATCH -H "Content-Type:application/json" -d '{"name": "Cat"}' http://localhost:8080/movies/1

### Remove movie:

curl -X DELETE http://localhost:8080/movies/1
