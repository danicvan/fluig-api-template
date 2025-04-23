<h1 align="center">🚀 Fluig API Template</h1>
<p align="center">
  Spring Boot starter project for deploying secure REST APIs on <strong>TOTVS Fluig</strong>.
  <br>
  Projeto base em Spring Boot para criar APIs REST no <strong>Fluig</strong>.
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-11-blue.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.6.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Build WAR](https://img.shields.io/badge/Packaging-WAR-orange.svg)](#)
[![Fluig Ready](https://img.shields.io/badge/Fluig-Compatible-blueviolet)](https://www.fluig.com/)

</div>

---

## 🇧🇷 Sobre o Projeto

Este repositório traz um template completo para criar **APIs REST seguras** utilizando **Spring Boot**, prontas para serem empacotadas como `.war` e instaladas como **componentes backend** no TOTVS **Fluig**.

> Ideal para integrações como DocuSign, SAP, Protheus, entre outros.

---

## 🇺🇸 About this Project

This is a full-featured template to build **secure REST APIs** with **Spring Boot**, pre-configured to deploy as a `.war` on **TOTVS Fluig**.

> Perfect for integrations like DocuSign, SAP, Protheus, etc.

---

## 🌐 Endpoints disponíveis

| Método | Caminho | Descrição                       |
| ------ | ------- | ------------------------------- |
| GET    | `/ping` | Teste básico (retorna ✅)       |
| GET    | `/`     | Retorna mensagem de boas-vindas |

---

## 📂 Estrutura do Projeto

src/ └── main/ ├── java/ │ └── com/ │ └── boadigital/ │ └── fluigapi/ │ ├── FluigApiApplication.java │ └── controller/ │ └── HealthCheckController.java └── resources/ └── application.properties

---

## 🛠️ Tecnologias

- [Java 11](https://www.oracle.com/java/)
- [Spring Boot 2.6.3](https://spring.io/projects/spring-boot)
- [Apache Maven](https://maven.apache.org/)
- WAR ready for deployment in [Fluig](https://www.fluig.com/)

---

## ⚙️ Como rodar

```bash
# 1. Clone o projeto
git clone https://github.com/boadigital/fluig-api-template.git

# 2. Entre na pasta
cd fluig-api-template

# 3. Build com Maven
mvn clean install

# 4. Deploy do .war no Fluig
```
