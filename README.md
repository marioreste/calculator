# Calculator

A simple calculator written in Java, designed to perform basic mathematical operations.

## Features

- Basic arithmetic operations: addition, subtraction, multiplication, and division.
- Modular implementation for easy extensibility.
- Exception handling for invalid operations.
- Automated testing with JUnit for reliability.

## Requirements

Before getting started, make sure you have installed:

- **Java 17** or later
- **Maven** for dependency and build management
- **Git** (optional, for cloning the repository)

## Installation

To run the project locally:

1. Clone the repository:

   ```bash
   git clone https://github.com/marioreste/calculator.git
   cd calculator
   ```

2. Build and run tests using Maven:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   java -jar target/calculator-1.0-SNAPSHOT.jar
   ```

## Project Structure

The project follows a standard Maven structure:

```
calculator/
│-- src/
│   ├── main/java/com/example/calculator/  # Main source code
│   ├── test/java/com/example/calculator/  # Unit tests
│-- pom.xml  # Maven configuration file
│-- README.md  # Documentation
```

## Maven Configuration

The project follows coding style guidelines enforced using Checkstyle. The Checkstyle configuration can be found in the `checkstyle.xml` file. To run Checkstyle, use the following command:

```bash
mvn checkstyle:check
```

Ensure that your code adheres to the specified coding standards before submitting contributions.

## Maven Configuration

The project uses Maven for dependency management. Below are some key dependencies defined in `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>net.sourceforge.jeval</groupId>
        <artifactId>jeval</artifactId>
        <version>1.3.4</version>
    </dependency>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature/feature-name`).
3. Make your changes and commit them (`git commit -m 'Added new feature'`).
4. Push the branch (`git push origin feature/feature-name`).
5. Open a **Pull Request** for review.

## License

This project is licensed under the **MIT** license. See the [LICENSE](LICENSE) file for more details.

For any questions or suggestions, contact me at **marioreste@gmail.com**.

