
# Java DevOps Kubernetes Project

A simple Java Spring Boot application built as a complete DevOps learning project.

## Application

The application provides:

- `/` - Home endpoint
- `/health` - Application health endpoint
- `/actuator/health` - Spring Boot health information
- `/actuator/metrics` - Application metrics
- `/actuator/prometheus` - Prometheus metrics

## Technology Stack

- Java 21
- Spring Boot
- Maven
- Git
- GitHub
- Docker
- Docker Hub
- GitHub Actions
- Ansible
- Kubernetes
- Helm
- Prometheus
- Grafana

## DevOps Flow

Java Application
        ↓
Git / GitHub
        ↓
Maven Build & Test
        ↓
Docker Image
        ↓
Docker Hub
        ↓
GitHub Actions CI/CD
        ↓
Ansible
        ↓
Kubernetes
        ↓
Prometheus
        ↓
Grafana

## Project Structure

```text
java-devops-k8s-project/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/example/devops/
    │   │       ├── DevOpsApplication.java
    │   │       └── AppController.java
    │   └── resources/
    │       └── application.properties
    └── test/
        └── java/
            └── com/example/devops/
                └── AppControllerTest.java

