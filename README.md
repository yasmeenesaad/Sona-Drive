# SonaDrive Project

**SonaDrive** is an innovative software solution designed for managing company and country data mapping efficiently. This project utilizes modern Java technologies like Spring Boot, MapStruct for object mapping, and various other utilities for seamless integration and functionality.

---

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Tests](#tests)
- [Contributing](#contributing)
- [Country Mapper Test Suite](#Country-Mapper-Test-Suite)
- [Company Mapper Test Suite](#Company-Mapper-Test-Suite)
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
# Country Mapper Test Suite

This document describes the test cases implemented for the `CountryMapper` class. The `CountryMapper` is responsible for mapping between the `Country` entity and the `CountryDto` data transfer object, ensuring data consistency and integrity.

## Test Cases

### 1. `testToDto`
- **Purpose**: Tests the basic functionality of mapping a `Country` entity to a `CountryDto`.
- **Setup**: Creates a `Country` object with valid `id` and `isoCode` fields.
- **Expected Result**: Ensures the resulting `CountryDto` contains the same values as the input entity.

---

### 2. `testToDtoWithNullCountry`
- **Purpose**: Tests the behavior when a `null` `Country` is passed to the mapper.
- **Setup**: Passes a `null` `Country` object to the mapper.
- **Expected Result**: Returns a `null` `CountryDto`.

---

### 3. `testToDtoWithIncompleteCountry`
- **Purpose**: Tests mapping when the `Country` entity contains incomplete or default values.
- **Setup**: Creates a `Country` object with a default `id` (0) and a `null` `isoCode`.
- **Expected Result**: Returns a `CountryDto` with corresponding default or `null` values.

---

### 4. `testToEntity`
- **Purpose**: Tests the basic functionality of mapping a `CountryDto` to a `Country` entity.
- **Setup**: Creates a `CountryDto` object with valid `id` and `isoCode` fields.
- **Expected Result**: Ensures the resulting `Country` entity contains the same values as the input DTO.

---

### 5. `testToEntityWithNullCountryDto`
- **Purpose**: Tests the behavior when a `null` `CountryDto` is passed to the mapper.
- **Setup**: Passes a `null` `CountryDto` object to the mapper.
- **Expected Result**: Returns a `null` `Country` entity.

---

### 6. `testToEntityWithIncompleteCountryDto`
- **Purpose**: Tests mapping when the `CountryDto` contains incomplete or default values.
- **Setup**: Creates a `CountryDto` object with a default `id` (0) and a `null` `isoCode`.
- **Expected Result**: Returns a `Country` entity with corresponding default or `null` values.

---

### 7. `testBiDirectionalMapping`
- **Purpose**: Ensures consistency in bi-directional mapping between `Country` and `CountryDto`.
- **Setup**:
  1. Creates a `Country` object with valid `id` and `isoCode`.
  2. Maps it to a `CountryDto`.
  3. Maps the `CountryDto` back to a `Country`.
- **Expected Result**: The final `Country` object should have the same values as the initial one, verifying data integrity during both mappings.

---

# Company Mapper Test Suite

This document describes the test cases implemented for the `CompanyMapper` class. The `CompanyMapper` is responsible for mapping between the `Company` entity and the `CompanyDto` data transfer object, ensuring data consistency and integrity.

## Test Cases

### 1. `testMapping`
- **Purpose**: Tests the basic functionality of mapping a `Company` entity to a `CompanyDto`.
- **Setup**:
  1. Creates a `Country` object with valid `id` and `isoCode`.
  2. Creates a `Company` object with valid `id`, `name`, and the `Country` object.
- **Expected Result**: Ensures the resulting `CompanyDto` contains the same values as the input `Company` entity, including its nested `Country` data.

---

### 2. `testReverseMapping`
- **Purpose**: Tests the reverse mapping from `CompanyDto` to `Company`.
- **Setup**:
  1. Creates a `CompanyDto` object with valid `id`, `name`, and a `CountryDto` object with valid `id` and `isoCode`.
  2. Maps the `CompanyDto` back to a `Company` entity.
- **Expected Result**: Ensures the resulting `Company` entity matches the values in the `CompanyDto`, including its nested `Country` data.

---

### 3. `testToDtoWithNullCompany`
- **Purpose**: Tests the behavior when a `null` `Company` entity is passed to the mapper.
- **Setup**: Passes a `null` `Company` object to the mapper.
- **Expected Result**: Returns a `null` `CompanyDto`.

---

### 4. `testToEntityWithNullCompanyDto`
- **Purpose**: Tests the behavior when a `null` `CompanyDto` is passed to the mapper.
- **Setup**: Passes a `null` `CompanyDto` object to the mapper.
- **Expected Result**: Returns a `null` `Company` entity.

---

### 5. `testToDtoWithIncompleteCompany`
- **Purpose**: Tests mapping when the `Company` entity contains incomplete or default values.
- **Setup**:
  1. Creates a `Company` object with default `id` (0), `name` as `null`, and a `Country` object with default or `null` values.
  2. Maps the `Company` object to a `CompanyDto`.
- **Expected Result**: Returns a `CompanyDto` with corresponding default or `null` values.

---

### 6. `testToEntityWithIncompleteCompanyDto`
- **Purpose**: Tests mapping when the `CompanyDto` contains incomplete or default values.
- **Setup**:
  1. Creates a `CompanyDto` object with default `id` (0), `name` as `null`, and a `CountryDto` object with default or `null` values.
  2. Maps the `CompanyDto` object to a `Company` entity.
- **Expected Result**: Returns a `Company` entity with corresponding default or `null` values.

---

### 7. `testBiDirectionalMapping`
- **Purpose**: Ensures consistency in bi-directional mapping between `Company` and `CompanyDto`.
- **Setup**:
  1. Creates a `Company` object with valid `id`, `name`, and a nested `Country` object.
  2. Maps it to a `CompanyDto`.
  3. Maps the `CompanyDto` back to a `Company` entity.
- **Expected Result**: The final `Company` object should have the same values as the initial one, verifying data integrity during both mappings.

---

## Contributing

We welcome contributions! If you have suggestions or improvements, feel free to fork the project and submit a pull request.

1. Fork the repository
2. Create a new branch (e.g., `git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a new Pull Request
