# Fox Farm

## Project Overview
This project is a Java application based on Spring Boot and SQL database integration. It manages a collection of fox entities, providing CRUD (Create, Read, Update, Delete) functionalities. The application employs JPA (Java Persistence API) for entity management and exposes RESTful endpoints to interact with the fox data.

## Technologies Used
- Java
- Spring Boot
- JPA (Java Persistence API)
- SQL
- Thymeleaf (for templating)

## Project Structure
The project comprises the following key components:

### Model (`com.gfa.springplussql.model`)
Defines the structure of the `Fox` entity and its attributes (name, color, age) using JPA annotations for entity mapping.

### Repository (`com.gfa.springplussql.repository`)
Contains the `FoxRepository` interface, extending `JpaRepository`. It offers methods for querying the database to perform operations on the `Fox` entity, including custom queries with JPQL (Java Persistence Query Language) and native SQL.

### Service (`com.gfa.springplussql.service`)
Implements business logic related to fox operations. The `FoxServiceImpl` class implements methods to interact with `FoxRepository` and perform CRUD operations.

### Controller (`com.gfa.springplussql.controller`)
Handles HTTP requests, acting as an interface between the frontend and backend. The `FoxController` class defines various endpoints to create, retrieve, update, and delete fox entities.

## How to Run the Application
1. Clone the project repository.
2. Ensure you have Java and Gradle installed on your machine.
3. Configure your SQL database settings in the `application.properties` file.
4. Build the project using Gradle. Run `./gradlew build` in the project root directory.
5. Run the application using the appropriate Gradle command. You can use `./gradlew bootRun` to start the application.

## Available Endpoints
- `GET /`: Displays a list of all fox entities.
- `POST /`: Creates a new fox entity.
- `GET /delete/{id}`: Deletes a fox entity by ID.
- `GET /increase/{id}`: Updates the age of a fox entity by incrementing it.
- `GET /filter?search={name}`: Filters fox entities by name.
- `GET /red-jpql`: Retrieves all red fox entities using JPQL.
- `GET /red-native`: Retrieves all red fox entities using native SQL queries.