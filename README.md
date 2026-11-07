# Company Management System

A web-based Company Management System developed using **Java and Spring Boot** as part of college practical coursework. The application allows users to manage company records through a simple web interface, with data stored in a MySQL database.

## About the Project

This project demonstrates the implementation of Spring Boot's layered architecture using Controller, Service and Repository layers. It uses Spring Data JPA for database operations and Thymeleaf for rendering dynamic HTML pages.

## Technologies Used

- **Programming Language:** Java
- **Framework:** Spring Boot
- **Database:** MySQL
- **ORM / Persistence:** Spring Data JPA, Hibernate
- **Frontend:** HTML, CSS, Thymeleaf
- **Build Tool:** Maven
- **IDE:** Eclipse

## Features

- Add new company records.
- View the list of registered companies.
- Delete existing company records.
- Store and retrieve company information using MySQL.
- Use a layered application architecture.

## Company Information

Each company record contains the following fields:

- Company ID
- Company Name
- Location
- Industry
- Email
- Phone Number

## Project Architecture

The application follows a layered architecture:

```text
          User
            |
            v
      Controller Layer
            |
            v
       Service Layer
            |
            v
      Repository Layer
            |
            v
        MySQL Database
```

### Layer Responsibilities

**1. Controller Layer**

- Handles incoming HTTP requests.
- Receives user input from web forms.
- Communicates with the Service layer.

**2. Service Layer**

- Contains the application's business logic.
- Processes requests received from the Controller.
- Calls Repository methods for database operations.

**3. Repository Layer**

- Extends `JpaRepository`.
- Handles database operations using Spring Data JPA.
- Reduces the need to write basic SQL queries manually.

## Project Structure

```text
CompanyManagementSystem/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com.app/
│       │       ├── CompanyController.java
│       │       ├── Company.java
│       │       ├── CompanyRepository.java
│       │       └── CompanyService.java
│       │
│       └── resources/
│           ├── templates/
│           │   ├── companies.html
│           │   └── add-company.html
│           │
│           └── application.properties
│
├── pom.xml
└── README.md
```

*Note: Adjust the package and folder names above to match your actual project structure.*

## Database Configuration

This project uses MySQL as its database.

1. Install MySQL and start the MySQL server.
2. Create a database:

```sql
CREATE DATABASE company;
```

3. Configure your database connection in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/company
spring.datasource.username=USERNAME
spring.datasource.password=PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace the username and password with your local MySQL credentials.

**Important:** Never upload actual database passwords or other credentials to GitHub.

## How to Run the Project

**Prerequisites:**

- Java Development Kit (JDK 21)
- MySQL Server
- Maven
- Eclipse or another Java IDE

**Steps:**

1. Clone the repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

2. Open the project in Eclipse or your preferred Java IDE.

3. Configure the MySQL database connection in `application.properties`.

4. Build and run the application:

```bash
mvn clean install
mvn spring-boot:run
```

5. Open your browser and visit:

```text
http://localhost:8080/companies
```

## Learning Outcomes

Through this project, I gained practical experience with:

- Spring Boot application development.
- Understanding Controller-Service-Repository architecture.
- Performing database operations using Spring Data JPA.
- Connecting a Spring Boot application with MySQL.
- Creating dynamic web pages using Thymeleaf.
- Debugging and resolving implementation errors.

## Project Status

**Completed – Academic Practical Project**

This project implements company record creation, retrieval and deletion. Update functionality is not currently implemented.

## Author

**Omkar Mardhekar**

B.Sc. Information Technology
University of Mumbai

