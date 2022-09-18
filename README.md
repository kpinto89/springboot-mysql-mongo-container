# springboot-mysql-mongo-container
Dockerizing Spring Boot application with MySQL Mongo DB on same container

## Docker-Compose

1. Run docker-compose.yml for Mongo DB

2. Run docker-compose.yml for MySQL

## Validating apis

1. GET http://localhost:8086/employees - MySQL to get [] response

2. GET http://localhost:8087/employees - Mongo to get [] response

3. POST http://localhost:8086/employees with below request body - Creates employee in SQL and internally calls API for Mongo

{
    "employeeId": 1,
    "employeeFirstName":"FirstName",
    "employeeLastName":"LastName",
    "employeeAddress":"Address",
    "employeeEmail":"email.address@gmail.com"
}

4. GET http://localhost:8087/employees - Check employee is added in MongoDB
