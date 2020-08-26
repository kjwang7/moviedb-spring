# Movie DB with RESTful front end

This is a Spring application for accessing a movie database in relational JPA with a hypermedia-based RESTful front end. It is built using Spring Boot, JPA and H2.

Each movie in the database has an ​id ​(long), ​name (varchar), ​rating​ from 1 to 10 (int), and a ​description​ (varchar).

**Import as a Maven project**

**Run the application: ./mvnw spring-boot:run**

## User can:

**1. Add movies**. For example:

curl -i -H "Content-Type:application/json" -d '{"id": "1", "name": "Cat", "rating": "2", "description": "Cartoon"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "2", "name": "Rain", "rating": "5", "description": "Story"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "3", "name": "Star wars", "rating": "3", "description": "Fiction"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "4", "name": "Lion King", "rating": "6", "description": "Cartoon"}' http://localhost:8080/movies

curl -i -H "Content-Type:application/json" -d '{"id": "5", "name": "Titanic", "rating": "1", "description": "Story"}' http://localhost:8080/movies

**2. View all movie records.**

curl http://localhost:8080/movies

**3. Search movie by ID.** For example:

curl http://localhost:8080/movies/1

**4. Search movie by name.** For example:

curl http://localhost:8080/movies/search/findByName?name=Cat

**4. Replace/Add movies.** For example:

curl -X PUT -H "Content-Type:application/json" -d '{"id": "2", "name": "Rain", "rating": "2", "description": "Story"}' http://localhost:8080/movies/2

**5. Update movie.** For example:

curl -X PATCH -H "Content-Type:application/json" -d '{"description": "Classic"}' http://localhost:8080/movies/5

**6. Remove movie.** For example:

curl -X DELETE http://localhost:8080/movies/1

This application is created following this guide:
Reference: https://spring.io/guides/gs/accessing-data-rest