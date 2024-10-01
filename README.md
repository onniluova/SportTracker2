# Sports Time Tracker

A Java application for tracking time spent on various sports activities.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Testing](#testing)
- [Docker Support](#docker-support)
- [CI/CD with Jenkins](#cicd-with-jenkins)
- [Project Structure](#project-structure)
- [Contributing](#contributing)

## Overview

Sports Time Tracker is a command-line application that helps users log and track their sports activities. It allows users to record different activities, view their logged activities, and calculate the total time spent on sports.

## My experience
This was a fun task. I faced challenges with getting the image to work and with the Jenkins pipeline, but eventually got it to work. I learned a lot about Docker and Jenkins in the process.

## Features

- Log sports activities with duration
- View all logged activities
- Calculate total time spent on sports
- Simple command-line interface
- Unit tests for core functionality

## Prerequisites

- Java 11 or higher
- Maven (for building and running tests)
- Docker (optional, for containerization)
- Jenkins (optional, for CI/CD)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/sports-time-tracker.git
cd sports-time-tracker
```

2. Build the project:
```bash
mvn clean package
```

## Usage

1. Run the application:
```bash
java -jar target/sports-time-tracker.jar
```

2. Follow the on-screen menu:
    - Choose 1 to log a new activity
    - Choose 2 to view all logged activities
    - Choose 3 to calculate total time spent
    - Choose 4 to exit

Example session:
```
1. Log Activity
2. View Activities
3. Calculate Total Time
4. Exit
Choose an option: 1
Enter activity name: Running
Enter duration in minutes: 30

1. Log Activity
2. View Activities
3. Calculate Total Time
4. Exit
Choose an option: 2
Running: 30 minutes
```

## Testing

Run the tests using Maven:
```bash
mvn test
```

The project includes JUnit tests covering core functionality:
- Activity logging
- Activity viewing
- Total time calculation

## Docker Support

1. Build the Docker image:
```bash
docker build -t sports-time-tracker .
```

2. Run the application in a container:
```bash
docker run -it sports-time-tracker
```

## CI/CD with Jenkins

The project includes a Jenkinsfile for automated CI/CD:
1. Pulls code from GitHub
2. Builds the application
3. Runs tests
4. Creates a Docker image
5. Pushes the image to Docker Hub

## Project Structure

```
sports-time-tracker/
├── src/
│   ├── main/java/
│   │   └── SportsTimeTracker.java
│   └── test/java/
│       └── SportsTimeTrackerTest.java
├── Dockerfile
├── Jenkinsfile
├── pom.xml
└── README.md
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

---

For any questions or issues, please open an issue on the GitHub repository.