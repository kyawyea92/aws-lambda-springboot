# Spring Boot with AWS Lambda  

This project demonstrates how to deploy a **Spring Boot** application as an **AWS Lambda** function. It also includes API Gateway configuration to expose the Lambda as a REST API.  

### 🚀 Features  

- Spring Boot integrated with AWS Lambda  
- AWS API Gateway configuration  
- Deployment as a Lambda function in ZIP format  

---

## 🛠 Prerequisites  

Before setting up, ensure you have the following installed:  

- **Java 21**  
- **Maven**  
- **AWS CLI** (Configured with IAM access)  
- **AWS SAM CLI** (Optional for local testing)  

---

## 📂 Project Structure  

```
spring-boot-aws-lambda/
│── src/main/java/com/example/lambda/
│   ├── LambdaHandler.java  # Main Lambda handler class
│   ├── SpringBootLambdaApplication.java  # Main Spring Boot application
│── src/main/resources/
│── pom.xml  # Maven dependencies
│── template.yaml  # AWS SAM Template (Optional)
│── README.md
```  

---

## 📌 AWS Lambda Configuration  

### 1️⃣ **Create a Spring Boot AWS Lambda Handler**  

In your Spring Boot application, create a Lambda handler that extends `SpringBootRequestHandler`:  

```java
package com.example.lambda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import com.example.lambda.function.MyFunction;

public class LambdaHandler extends SpringBootRequestHandler<String, String> {
}
```

Ensure you have a **Spring Cloud Function** bean that acts as the entry point:  

```java
@Bean
public Function<String, String> hello() {
    return (input) -> "Hello, " + input + " from AWS Lambda!";
}
```

---

## 📌 AWS API Gateway Configuration  

To expose the Lambda as a REST API, follow these steps:  

1️⃣ Open **AWS API Gateway**  
2️⃣ Create a new **HTTP API**  
3️⃣ Add an integration with your **Lambda function**  
4️⃣ Configure **routes and methods** (`GET`/`POST`)  
5️⃣ Deploy the API and get the **Invoke URL**  

---

## 📌 Packaging and Deploying  

### 1️⃣ **Build the Project and Create a ZIP**  

```sh
mvn clean package
```

The generated ZIP file will be in `target/`:

```sh
target/spring-boot-aws-lambda-0.0.1-SNAPSHOT-aws.jar
```

### 2️⃣ **Upload the ZIP to AWS Lambda**  

```
   (1) login to your aws account
   (2) search AWS lambda
   (3) create new AWS lambda
   (4) upload your project zip file under the target directory.
```

---

## 📌 Conclusion  

This project integrates **Spring Boot** with **AWS Lambda** to create a serverless API using **AWS API Gateway**. You can now deploy, manage, and scale your application without managing servers.  

💡 **Feel free to contribute or improve this project!** 🚀  

---

### 📜 License  

This project is licensed under the [MIT License](LICENSE).  
