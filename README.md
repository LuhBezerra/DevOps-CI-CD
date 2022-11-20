# Installation
## with docker-compose 

#### 1. Copy the env-example to .env and setting it
```bash
cp env-example .env
```

#### 2. Set docker secrets 
- To use the secrets is necessary to create 2 txt files `db_password.txt` and `db_root_password.txt`
- Then create the secrets with docker
  ```bash
  docker secret create db_password db_password.txt
  ```
  ```bash
  docker secret create db_root_password db_root_password.txt
  ```
#### 3. Build and up the containers 
```bash
docker-compose up -d
```

#### 4. Open the get url http://localhost:80/users/list on browser
#### 4. Or send a post to url http://localhost:80/users/add on client http

#### Important: Project use Adminer so you can see database details in http://localhost:8081
```
Project use Adminer so you can see database details in http://localhost:8081
Check user and password in your .env 
```

----
## Vagrant and Ansible

#### 1. Copy the registration.token.env-example to registration.token.env and setting it
```bash
cp registration.token.env-example ansible-playbooks/registration.token.env
```

#### 2. Build and up the machines 
```bash
vagrant up
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
