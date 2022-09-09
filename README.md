# Installation
## with docker-compose 

#### 1. Copy the env-example to .env and setting it
```bash
cp env-example .env
```

#### 2. Build and up the containers 
```bash
docker-compose up -d
```

#### 4. Open the get url http://localhost:9000/users/list on browser
#### 4. Or send a post to url http://localhost:9000/users/add on client http

#### Important: Project use Adminer so you can see database details in http://localhost::8081
```
Project use Adminer so you can see database details in http://localhost::8081
Check user and password in your .env 
```

# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.spring-boot' is invalid and this project uses 'com.example.springboot' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.5/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

