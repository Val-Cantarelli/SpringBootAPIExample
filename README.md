# ImersaoJava - Languages API

## About the Project

This project was developed as part of an immersion process to explore and learn the main concepts of the Spring ecosystem. It is a REST API in Java, built with the Spring Boot framework, that allows you to register and list languages (such as programming languages), using the NoSQL database MongoDB for data persistence.

The main goal is to provide a practical environment to experiment with features such as dependency injection, creation of REST endpoints, database integration, and the application of development best practices, serving as a foundation for more advanced projects in the future.

## Features
- List all registered languages
- Add a new language

## Main Technologies Used
- **Java 17**: Main language of the project
- **Spring Boot 3**: Framework for rapid Java application development
- **Spring Data MongoDB**: Integration and data persistence with MongoDB
- **MongoDB**: NoSQL database used to store languages
- **JUnit**: Automated testing

## How to Run
1. Make sure you have Java 17+ installed.
2. Set up a MongoDB instance locally or in the cloud.
3. Clone this repository and access the project folder.
4. Configure the `src/main/resources/application.properties` file with your MongoDB credentials.
5. Run the command:
   ```bash
   ./gradlew bootRun
   ```
6. Access the endpoints using Postman, Insomnia, or your browser:
   - `GET /languages` to list languages
   - `POST /languages` to add a new language

---

Developed for educational purposes.
