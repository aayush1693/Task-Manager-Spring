# Task Manager ✅

**Lightweight Spring Boot task manager with a REST API, JPA persistence, and Liquibase migrations.**

---

## 🔧 Overview

This project is a simple task manager built with Spring Boot. It provides CRUD endpoints to manage tasks stored in a PostgreSQL database. Liquibase handles DB migrations.

## ⚙️ Requirements

- Java 21
- Maven
- PostgreSQL

## ⚠️ Configuration

`src/main/resources/application.properties` .

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskmanager
spring.datasource.username=taskuser
spring.datasource.password=taskpass
spring.liquibase.change-log=classpath:db/changelog/db.changelog-master.yaml
```

> Liquibase is configured and will run migrations on startup using the files under `src/main/resources/db/changelog`.

## 🚀 Quick start

Run the application using Maven:

```bash
# build and run
mvn spring-boot:run

# or build jar and run
mvn -DskipTests package
java -jar target/*.jar
```

The API will be available at `http://localhost:8080` by default.

## 📚 API Endpoints

Base path: `/api/tasks`

| Method | Endpoint | Description | Request body |
|--------|----------|-------------|--------------|
| GET    | `/api/tasks` | List all tasks | — |
| POST   | `/api/tasks` | Create a new task | `{ "title": "Buy milk", "completed": false }` |
| PUT    | `/api/tasks/{id}` | Update a task | `{ "title": "Buy milk", "completed": true }` |
| DELETE | `/api/tasks/{id}` | Delete a task | — |

