# etiyaa


Etiya application is a system that records the problems of customers and solution of problems. This project was developed using Java Spring Boot Framework. Firstly the customer is saved in the database then the product information that the customer has received is saved.Secondly, the customer's problem with the product is saved and the problem is processed. Finally, the faulty parts are repaired and operations are stored in the database.

# What's inside

This project is based on the Spring Boot project and uses these packages :

- Maven

- Spring Core

- Spring Data (Hibernate & MySQL)

- Spring MVC

- Spring Security

- Thymeleaf

- Bootstrap 4

# Installation

The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies. For example,
``Usage (with eclipse or Spring Tool Suite): 1 - Clone the project 2 - Eclipse: File -> Import -> Maven -> Existing Maven Projects 3 - Run 4 - Navigate to localhost:8081 ``

# Database configuration

Create a MySQL database with the name etiya and add the credentials to `` /resources/application.properties``.
The default ones are :

```
spring.datasource.url = jdbc:mysql://localhost:3306/etiya?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect 
```

**Notes:** ``You can create the database by importing the database/etiya.sql file via mysql workbench or phpmyadmin.Sample data is available in the database.``

# Server configuration

Necessary adjustments can be made in `` /resources/application.properties``. This application works by default at ``localhost: 8081``
```
server.port=8081
```
# Screenshot

### Login Page 

![login page](https://user-images.githubusercontent.com/30948803/52176953-6e119080-27cb-11e9-9d69-dd2288b41ff7.png)

### Home Page

![home page](https://user-images.githubusercontent.com/30948803/52176972-a7e29700-27cb-11e9-86eb-f4738297c029.png)

### Customer Record Page

![customer record page](https://user-images.githubusercontent.com/30948803/52182062-38d86300-280a-11e9-9469-7adbb22d6640.png)

### Customer List Page

![customer list](https://user-images.githubusercontent.com/30948803/52177000-ff810280-27cb-11e9-92a0-236abda3d81e.png)

### Product Form Page

![product form](https://user-images.githubusercontent.com/30948803/52177013-20495800-27cc-11e9-8a0b-321a0be7a575.png)

### Product List Page

![product list](https://user-images.githubusercontent.com/30948803/52177018-44a53480-27cc-11e9-9320-024cd2acde53.png)

### Issues Form Page

![issues form](https://user-images.githubusercontent.com/30948803/52181833-74256280-2807-11e9-8b89-bc7215a458d7.png)

### Issues List Page

![issues](https://user-images.githubusercontent.com/30948803/52181894-2a894780-2808-11e9-8e7a-8761a749cda6.png)

### Rest Api

![customer api](https://user-images.githubusercontent.com/30948803/52177045-9bab0980-27cc-11e9-9bc3-bdf2a0524833.png)

