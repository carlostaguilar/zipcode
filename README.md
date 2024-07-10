# Zipcode Lookup Service

## Overview
This project is a Spring Boot application designed to provide a RESTful API for managing addresses and querying address details using zip codes. It integrates with an external API, `https://api.brasilaberto.com/v1/zipcode`, to fetch address information based on zip codes.

## Features
- CRUD operations for addresses.
- Fetch address details using a zip code through an external API integration.

## Technologies
- Java
- Spring Boot
- Maven
- Feign Client for RESTful calls
- Lombok

## Getting Started

### Prerequisites
- JDK 11 or later
- Maven 3.6 or later

### Running the Application
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd zipcode-lookup-service
   ```
3. Build the project:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
