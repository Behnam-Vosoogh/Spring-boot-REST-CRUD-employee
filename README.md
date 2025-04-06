# Employee Directory REST API

A simple Java Spring Boot REST API that performs full CRUD operations on an employee database. The app uses Spring Boot, Spring Data JPA, and MySQL. Includes support for partial updates via PATCH requests.

---

## 📋 Features

- List all employees (`GET /api/employees`)
- Get an employee by ID (`GET /api/employees/{id}`)
- Add a new employee (`POST /api/employees`)
- Update an existing employee (`PUT /api/employees`)
- Partially update employee (`PATCH /api/employees/{id}`)
- Delete an employee (`DELETE /api/employees/{id}`)

---

## ⚙️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- RESTful API
- Jackson (for PATCH merge)

---

## 🗄️ Database

**MySQL Schema & Seed Data:**

```sql
CREATE DATABASE IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45),
  `last_name` VARCHAR(45),
  `email` VARCHAR(45),
  PRIMARY KEY (`id`)
);

INSERT INTO `employee` VALUES 
  (1, 'Leslie', 'Andrews', 'leslie@luv2code.com'),
  (2, 'Emma', 'Baumgarten', 'emma@luv2code.com'),
  (3, 'Avani', 'Gupta', 'avani@luv2code.com'),
  (4, 'Yuri', 'Petrov', 'yuri@luv2code.com'),
  (5, 'Juan', 'Vega', 'juan@luv2code.com');
```

---

## 🧪 How to Run

1. Clone the repo
2. Import as a Maven project in IntelliJ or VS Code
3. Set up MySQL and update `application.properties` with your DB config
4. Run the project with `CruddemoApplication.java`
5. Use Postman or curl to test API endpoints

---

## 📝 Notes

- The PATCH method uses Jackson’s `ObjectMapper` to merge partial JSON updates.
- You can enhance this with validation, DTOs, and exception handling using `@ControllerAdvice`.

---

## 📦 Future Enhancements

- Add Swagger for API documentation
- Add pagination & sorting
- Connect to a frontend (e.g., React or Angular)
- Dockerize the app

---

## 👨‍💻 Author

Behnam V  
*Simple, clean backend REST API in Spring Boot*
