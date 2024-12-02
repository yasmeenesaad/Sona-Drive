# SonaDrive Project

**SonaDrive** is an innovative software solution designed for managing company and country data mapping efficiently. This project utilizes modern Java technologies like Spring Boot, MapStruct for object mapping, and various other utilities for seamless integration and functionality.

---

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Tests](#tests)
- [Contributing](#contributing)
---

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yasmeenesaad/Sona-Drive
   ```
2. **Navigate to the project directory**:

   ```bash
   cd sonadrive
   ```

3. **Install dependencies**:

If you're using Maven, run the following command to install the required dependencies:
   ```bash
    mvn install
   ```
4. **Build the project**:

Build the project using Maven:
   ```bash
mvn clean install
   ```
5. **Usage**
To use the SonaDrive application, run the Spring Boot application:

   ```bash
    mvn spring-boot:run
   ```
This will start the server locally. You can then access the API or front-end interface depending on your project's setup.

## Technologies Used

- **Java 17**: The primary language for backend development.
- **Spring Boot**: Used for building the backend and creating a REST API.
- **MapStruct**: For mapping data between entities and DTOs.
- **JUnit**: For unit testing and test-driven development (TDD).
- **Maven**: For project dependency management and build automation.
## Tests

The project includes unit tests for the mappers and core logic. To run the tests:

```bash
mvn test
```
## Contributing

We welcome contributions! If you have suggestions or improvements, feel free to fork the project and submit a pull request.

1. Fork the repository
2. Create a new branch (e.g., `git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request
