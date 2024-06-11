# Hotel Reservation Management System

## Description

The Java Spring Hotel Scheduling Application is a web-based solution that leverages Java Spring Boot as the backend framework and Angular for the frontend. It enables multilingual support (English and French), diverse currency displays, time zone conversions, and containerization using Docker for efficient cloud deployment.


## Features

- **Localization & Internationalization**: Supports both English and French.
- **Currency Display**: Shows reservation prices in USD, CAD, and EUR.
- **Time Zone Conversion**: Converts times between ET, MT, and UTC for live presentations.
- **MultiThreading**: Implements multithreaded programming in Java, adhering to industry best practices for thread safety, synchronization, and efficient resource management.
- **JPA Integration**: Utilizes JPA to define the data model and persistence logic for entities.
- **Spring MVC REST API**: Couples JPA with Spring MVC annotations to expose REST API endpoints for effective management of hotel reservations.
- **Docker & Cloud Deployment**: Leverages Docker for containerized deployment to cloud services, enabling streamlined workflows. 


## Screenshots

![Hotel Scheduling Application](https://github.com/NikkaLuna/HotelSchedulingApplication_Java_Spring_Multithreading_with_Docker/blob/D387/Hotel%20Scheduling%20Application.png)

*This screenshot shows the main interface of the application where users can book rooms, view available rooms with prices in different currencies, and find information about a live presentation being presented at the hotel.*

<br><br>

![Docker Deployment](https://github.com/NikkaLuna/HotelSchedulingApplication_Java_Spring_Multithreading_with_Docker/blob/D387/Docker%20Deployment.png)

*This screenshot shows the Docker Desktop interface with the running container and the Landon Hotel application accessible via `localhost:8080`. It demonstrates the containerization and deployment of the application using Docker.*


## Challenge
**CORS Issues**: Encountered difficulties with Cross-Origin Resource Sharing (CORS) when setting up and integrating the Angular frontend with the backend REST API, which prevented the frontend from making requests to the backend due to security restrictions.

### Solution:
**CORS Configuration**: Resolved the issue by configuring CORS settings in the Spring Boot application, allowing the Angular frontend to communicate with the backend REST API.


## Usage

1. **Clone and Setup**: Clone the project from GitHub and set it up in your preferred IDE.
2. **Development and Testing**: Follow the development guidelines and perform necessary testing.
3. **Deployment**: Use the provided instructions to deploy the application using Docker and cloud services.

## Contribution Guidelines

Contributions are encouraged under the following conditions:

- Adherence to the project's core requirements and design.
- Commitment to maintaining the integrity and authenticity of the work.
- Alignment with the overall objectives of the Hotel scheduling application project.



## Authors

- [@NikkaLuna](https://github.com/NikkaLuna)


## 🚀 About Me
I'm a Software Engineer with an emphasis on Java, SQL, and AWS.  


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/andrea-hayes-msml/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/AHayes_Ninja_)
[![art portfolio](https://img.shields.io/badge/my_art-888?style=for-the-badge&logo=ko-fi&logoColor=white)](https://andreachristinehayes.wixsite.com/andreahayesart/)



