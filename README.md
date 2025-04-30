<h1 align="center">🚀 Fluig API Template</h1>
<p align="center">
  Spring Boot starter project for deploying secure REST APIs on <strong>TOTVS Fluig</strong>.
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-11-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.6.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Build WAR](https://img.shields.io/badge/Packaging-WAR-orange.svg)](#)
[![Fluig Ready](https://img.shields.io/badge/Fluig-Compatible-blueviolet)](https://www.fluig.com/)

</div>

---

## 🇺🇸 About this Project

This is a full-featured template to build **secure REST APIs** with **Spring Boot**, pre-configured to deploy as a `.war` on **TOTVS Fluig**.

> Perfect for integrations like DocuSign, SAP, Protheus, etc.

---

## 🌐 Available Endpoints

| Method | Path   | Description                   |
|--------|--------|-------------------------------|
| GET    | `/ping` | Basic test (returns ✅)       |
| GET    | `/`     | Returns welcome message       |

---

## 📂 Project Structure

src/ 
	└── main/ 
		├── java/ 
			│ └── com/ 
			│ 	└── suaempresa/ 
			│ 		└── fluigapi/ 
			│ 			├── FluigApiApplication.java 
			│ 			└── controller/ 
			│ 				└── HealthCheckController.java 
			└── resources/ 
				└── application.properties

---

## 🛠️ Technologies

- [Java 11](https://www.oracle.com/java/)
- [Spring Boot 2.6.3](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- WAR ready for deployment in [Fluig](https://www.fluig.com/)

---

## ⚙️ How to Run

```bash
# 1. Clone the project
git clone https://github.com/yourcompany/fluig-api-template.git

# 2. Enter the project directory
cd fluig-api-template

# 3. Build with Maven
mvn clean install

# 4. Deploy the .war on Fluig

