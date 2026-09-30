# Stock Management — API Test Automation

Automated API testing project for the Stock Management application, built with Java, Spring Boot Test, JUnit 5, and REST Assured.

The goal is to validate API behavior, verify business rules, identify regressions, and improve the reliability of backend services through automated testing.

## 🎯 Project Goals

- Automate API functional and regression tests.
- Validate HTTP responses, status codes, and response bodies.
- Test authentication and token validation flows.
- Cover positive and negative scenarios.
- Improve test organization, maintainability, and reusability.
- Establish a foundation for continuous integration.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 21 | Programming language |
| Spring Boot Test | Testing support and configuration |
| JUnit 5 | Test execution and assertions |
| REST Assured | HTTP requests and API validation |
| Maven | Dependency management and build automation |
| Node.js / Express | Target API technology |
| MongoDB | Target database |

## 🧪 Testing Strategy

The test suite is designed to cover:

- Authentication: valid and invalid credentials.
- Token validation: valid, invalid, and missing tokens.
- HTTP status codes and response payloads.
- Negative scenarios and error handling.
- Regression scenarios for existing API behavior.

Test coverage will evolve as new scenarios are implemented.

## 🏗️ Architecture

This repository contains the automated test suite, separated from the application under test.

- **Test project:** Java, Spring Boot Test, JUnit 5, REST Assured, and Maven.
- **Target application:** Stock Management API built with Node.js, Express, and MongoDB.

## ⚙️ Prerequisites

Before running the tests, make sure you have:

- Java JDK 21 or later.
- Maven 3.9+ or the Maven Wrapper.
- The Stock Management API running.
- A configured API base URL and any required test credentials.

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/GabrielBitencourty/stock-management-test.git
cd stock-management-test
```

### 2. Configure the environment

Configure the base URL of the API and any required credentials using the project's environment configuration.

Do not commit passwords, access tokens, or other secrets to the repository.

### 3. Run the tests

Using Maven:

```bash
mvn test
```

If the project includes the Maven Wrapper, you can also use:

Windows:

```powershell
.\mvnw.cmd test
```

Linux / macOS:

```bash
./mvnw test
```

## 📈 Project Status

🚧 In development.

The project is being built incrementally, starting with the test infrastructure and authentication scenarios, followed by additional functional and regression tests.

## 👨‍💻 Author

**Gabriel Bitencourt**

Software Engineering student interested in Software Quality Assurance, test automation, backend development, and reliable software systems.

- GitHub: [@GabrielBitencourty](https://github.com/GabrielBitencourty)

---

*Built to practice API test automation and demonstrate software quality engineering skills.*
