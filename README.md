# Student Management REST API

This is a Spring Boot CRUD REST API project developed for learning backend development concepts.

## Technologies Used

- Java 21
- Spring Boot
- Maven
- Eclipse IDE
- Spring Web

---

## Features

- Get all students
- Get student by ID
- Add student
- Update student
- Delete student

---

## REST API Endpoints

### Get All Students

GET

```bash
http://localhost:8080/students
```

---

### Get Student By ID

GET

```bash
http://localhost:8080/students/1
```

---

### Add Student

POST

```bash
http://localhost:8080/students
```

Request Body:

```json
{
  "id": 3,
  "name": "Gnana",
  "course": "SpringBoot & Microservices",
  "fee": 10000
}
```

---

### Update Student

PUT

```bash
http://localhost:8080/students/1
```

---

### Delete Student

DELETE

```bash
http://localhost:8080/students/1
```

---

## Project Structure

```text
src/main/java
 ├── controller
 ├── model
 ├── service
 └── StudentApiApplication
```

---

## How to Run

1. Clone repository

```bash
git clone <your-repo-url>
```

2. Open project in Eclipse

3. Run:

```text
Run As → Spring Boot App
```

4. Test APIs using browser or Postman

---

## Concepts Learned

- REST APIs
- CRUD operations
- JSON handling
- RequestBody
- PathVariable
- Service layer
- Dependency Injection

---

## Future Improvements

- Database integration
- Spring Data JPA
- Validation
- Exception handling
- Swagger documentation
- Security

---

## Author

Gattam Gnanendra
