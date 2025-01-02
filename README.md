# microservice-project

# Spring Book Microservice Project

## Table of Contents

- [Description](#description)
- [Architecture](#architecture)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
  - [API Gateway](#api-gateway)
  - [Config Server](#config-server)
  - [Service Registry](#service-registry)
  - [Department Service](#department-service)
  - [Employee Service](#employee-service)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Description

The **Spring Book Microservice Project** is a comprehensive example of a microservices architecture built with Spring Boot and Spring Cloud. It demonstrates how to structure and manage multiple interconnected services, including API Gateway, Config Server, Service Registry, Department Service, and Employee Service.

## Architecture

![Architecture Diagram](path/to/architecture-diagram.png)

The project follows a microservices architecture, where each service is responsible for a specific functionality. The API Gateway serves as the entry point, routing requests to the appropriate services. The Config Server manages external configurations, and the Service Registry handles service discovery.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Spring Cloud Gateway**
- **Spring Cloud Config**
- **Netflix Eureka**
- **Maven**
- **Docker** (optional)
- **Git**

## Installation

### Prerequisites

- **Java JDK 17** or higher
- **Maven 3.6+**
- **Git**
- **Docker** (optional, for containerization)

### Steps

1. **Clone the Repository**

    ```bash
    git clone https://github.com/abraham-tech/spring-book-microservice.git
    cd spring-book-microservice
    ```

2. **Build Each Service**

    Navigate to each service directory and build the project using Maven:

    ```bash
    cd config-server
    mvn clean install

    cd ../service-registry
    mvn clean install

    cd ../api-gateway
    mvn clean install

    cd ../department-service
    mvn clean install

    cd ../employee-service
    mvn clean install
    ```

## Usage

### Running the Services

It's recommended to run the services in the following order to ensure proper connectivity:

1. **Config Server**

    ```bash
    cd config-server
    mvn spring-boot:run
    ```

2. **Service Registry**

    ```bash
    cd ../service-registry
    mvn spring-boot:run
    ```

3. **API Gateway**

    ```bash
    cd ../api-gateway
    mvn spring-boot:run
    ```

4. **Department Service**

    ```bash
    cd ../department-service
    mvn spring-boot:run
    ```

5. **Employee Service**

    ```bash
    cd ../employee-service
    mvn spring-boot:run
    ```

### Accessing the Services

- **API Gateway**: [http://localhost:8080](http://localhost:8080)
- **Service Registry (Eureka Dashboard)**: [http://localhost:8761](http://localhost:8761)

### Sample Endpoints

- **Department Service**
  - `GET /api/departments`
  - `GET /api/departments/{id}`
  - `POST /api/departments`
  - `PUT /api/departments/{id}`
  - `DELETE /api/departments/{id}`

- **Employee Service**
  - `GET /api/employees`
  - `GET /api/employees/{id}`
  - `POST /api/employees`
  - `PUT /api/employees/{id}`
  - `DELETE /api/employees/{id}`

## Project Structure

```plaintext
spring-book-microservice/
├── api-gateway/
│   ├── src/
│   ├── pom.xml
├── config-server/
│   ├── src/
│   ├── pom.xml
├── service-registry/
│   ├── src/
│   ├── pom.xml
├── department-service/
│   ├── src/
│   ├── pom.xml
├── employee-service/
│   ├── src/
│   ├── pom.xml
├── README.md
└── .gitignore
```


## API Gateway
- Description: Routes incoming requests to the appropriate microservices.
- Port: 8080
- Configuration: Located in api-gateway/src/main/resources/application.yml
## Config Server
- Description: Centralized configuration management for all microservices.
- Port: 8888
- Configuration: Located in config-server/src/main/resources/application.yml
- Git Repository: Connects to a Git repository for external configurations.
## Service Registry
- Description: Service discovery using Netflix Eureka.
- Port: 8761
- Configuration: Located in service-registry/src/main/resources/application.yml
- Dashboard: http://localhost:8761
## Department Service
- Description: Manages department-related operations.
- Port: 8081
- Endpoints:
  - GET /api/departments
  - GET /api/departments/{id}
  - POST /api/departments
  - PUT /api/departments/{id}
  - DELETE /api/departments/{id}
- Configuration: Located in department-service/src/main/resources/application.yml
## Employee Service
- Description: Handles employee-related functionalities.
- Port: 8082
- Endpoints:
  - GET /api/employees
  - GET /api/employees/{id}
  - POST /api/employees
  - PUT /api/employees/{id}
  - DELETE /api/employees/{id}
- Configuration: Located in employee-service/src/main/resources/application.yml
## Contributing
Contributions are welcome! Please follow these steps:
1. Fork the Repository
2. Create a New Branch

## Start Rabbitmq server 
``` bash
docker pull rabbitmq:3.11.0
docker run --rm -it -p 5672:5672 rabbitmq:3.11.0
```

Please ensure your code follows the project's coding standards and includes relevant tests.

## License
This project is licensed under the MIT License.

## Contact
- Abraham Meja - abrahammeja3@gmail.com
- GitHub: [https://github.com/abraham-tech](https://github.com/abraham-tech)
