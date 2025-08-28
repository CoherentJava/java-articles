# TDD vs BDD Demo Project

A simple Java 17 project using Gradle 8.5 to explore Test-Driven Development vs Behavior-Driven Development concepts.

## Build and Run

**Build the project:**
```bash
./gradlew build
```

**Run the main class:**
```bash
./gradlew run
```

**Run tests:**
```bash
./gradlew test
```

## IntelliJ IDEA

This project can be imported directly into IntelliJ IDEA as a Gradle project. Simply open the `tdd-vs-bdd` directory in IntelliJ and it will automatically detect the Gradle configuration.

## Project Structure

- `src/main/java/blog/coherentjava/` - Source code
- `src/test/java/blog/coherentjava/` - Test code
- `build.gradle` - Gradle build configuration
- `gradle.properties` - Gradle properties including Java 21 home
