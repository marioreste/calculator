# Calculator

A calculator written in Java with support for mathematical operations.

## Features
- Support for basic arithmetic operations.
- **Maven**-based structure for dependency and build management.
- Automated testing with **JUnit**.

## Requirements
- **Java 17** or later
- **Maven** installed
- **Git** to clone the repository (optional)

## Installation

Clone the repository and navigate to the project folder:
```sh
git clone https://github.com/marioreste/calculator.git
cd calculator
```

Build and run tests using Maven:
```sh
mvn clean install
```

To execute the program:
```sh
java -jar target/calculator-1.0-SNAPSHOT.jar
```

## Project Configuration
The project is configured with **Maven**, so dependencies are managed automatically in the `pom.xml` file:
```xml
<dependencies>
    <dependency>
        <groupId>net.sourceforge.jeval</groupId>
        <artifactId>jeval</artifactId>
        <version>1.3.4</version>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>RELEASE</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Testing
Tests are written using **JUnit 5**. To run the tests:
```sh
mvn test
```

## Running with Docker
To run the application inside a Docker container, use the following `Dockerfile`:
```dockerfile
FROM ubuntu:latest
RUN apt-get update && apt-get install -y \
    openjdk-17-jdk \
    maven \
    git && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

RUN git clone https://github.com/marioreste/calculator.git

WORKDIR /calculator
RUN mvn package

WORKDIR target
CMD ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]
```
Build and run the container:
```sh
docker build -t calculator .
docker run --rm -it calculator
```

## License
This project is distributed under the **MIT** license.

---
**Author:** [marioreste](https://github.com/marioreste)

