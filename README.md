
# TC Verificator Service

**TC Verificator Service** is a Spring Boot-based microservice that validates Turkish Citizen Identification Numbers (TC Kimlik No) by interacting with an external SOAP web service. The service ensures data integrity and provides a reliable validation mechanism using best practices in modern Java development.

## Features

- **TC Identification Number Validation**: Validates Turkish Citizen Identification Numbers through an external SOAP-based service.
- **SOAP Communication**: Leverages Spring Web Services (`spring-ws`) to interact with the external SOAP service.
- **Validation Mechanisms**:
  - Input validation using `spring-boot-starter-validation` (Jakarta Bean Validation).
  - Dynamic request and response handling through JAXB (`jaxb-runtime`).
- **Secure Communication**: Utilizes Spring Security for secure API access.
- **Caching Support**: Optimizes repetitive calls using Spring Cache.
- **RESTful API**: Provides a RESTful interface for client applications to interact with the service.

---

## Technologies Used

- **Java 21**: Latest features for performance and code readability.
- **Spring Boot 3.3.0**: Core framework for microservice development.
- **Spring Web Services (`spring-ws`)**: Facilitates SOAP communication.
- **Spring Security**: Implements secure endpoints.
- **Spring Validation**: Ensures valid input and output data.
- **Spring Cache**: Improves performance through caching.
- **JAXB**: Used for XML binding and unmarshalling/marshalling of SOAP messages.
- **Docker**: Enables containerized deployment.
- **Maven**: Dependency management and project build tool.

---

## How It Works

1. **Input Validation**:
   - The service validates user input (e.g., TC Identification Number) using Bean Validation before making external calls.
   - Example constraints:
     - TC Identification Number must be 11 digits.
     - Name and surname fields must not be empty.

2. **SOAP Request**:
   - A SOAP request is prepared and sent to the external validation service (`https://tckimlik.nvi.gov.tr`).
   - Request and response payloads are handled via JAXB to ensure seamless XML processing.

3. **Response Handling**:
   - The external service's response is processed, and the validation result is sent back to the client.
   - Includes detailed error handling for SOAP faults and connectivity issues.

4. **Error Handling**:
   - Comprehensive exception handling for invalid inputs, SOAP faults, and server errors.
   - Uses custom exception classes to provide meaningful error messages.

---

## API Endpoints

### 1. Validate TC Identification Number
**Endpoint**: `/api/v1/validate`

**Method**: `POST`

**Request Body**:
```json
{
  "tcNumber": "12345678901",
  "name": "John",
  "surname": "Doe",
  "birthYear": 1990
}
```

**Response**:
- **200 OK**: Valid TC Identification Number.
- **400 Bad Request**: Invalid input.
- **500 Internal Server Error**: Error communicating with the external SOAP service.

**Example Response**:
```json
{
  "status": "VALID",
  "message": "The provided TC Identification Number is valid."
}
```

---

## Installation and Setup

### Prerequisites
- Java 21
- Maven 3.9+
- Docker (optional for containerized deployment)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/tc-verificator-service.git
   cd tc-verificator-service
   ```
2. Build the project:
   ```bash
   mvn clean package
   ```
3. Run the application:
   ```bash
   java -jar target/tc-verificator-service-0.0.1-SNAPSHOT.jar
   ```
4. Alternatively, build and run the Docker container:
   ```bash
   docker build -t tc-verificator-service .
   docker run -p 8080:8080 tc-verificator-service
   ```

---

## Directory Structure
```plaintext
src/
├── main/
│   ├── java/com/tc/verificator/
│   │   ├── Controllers/        # RESTful API Controllers
│   │   ├── Clients/            # SOAP Client and DTOs
│   │   ├── Configs/            # Configuration classes (WebClient, Marshaller)
│   │   ├── Services/           # Service Layer
│   │   └── Models/             # Data Models
│   ├── resources/
│   │   ├── application.yml     # Configuration properties
│   │   └── wsdl/               # WSDL files (if applicable)
├── test/                       # Unit and Integration Tests
```


---

## Future Improvements

- Add OpenAPI/Swagger documentation for better API discoverability.
- Enhance caching strategies to handle dynamic configurations.
- Support additional validation mechanisms for expanded use cases.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
