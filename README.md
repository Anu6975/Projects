# DemoBlaze E-Commerce Website - BDD Automation Testing

## 📌 Project Overview

This project is an end-to-end web automation testing framework developed for the **DemoBlaze E-Commerce Website**.

The framework uses **Selenium WebDriver with Java**, **Cucumber**, **TestNG**, **Maven**, and the **Page Object Model (POM)** design pattern.

The main purpose of this project is to automate an end-to-end e-commerce flow and validate the expected behavior of the application.

---

## 🛠️ Technologies & Tools

- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven
- Page Object Model (POM)
- Git & GitHub
- IntelliJ IDEA

---

## 🧪 Automated Flow

The project automates the following end-to-end flow:

1. User Registration
2. User Login
3. Product Selection
4. Add Product to Cart
5. Cart Validation
6. Place Order
7. Logout

---

## 🏗️ Framework Structure

```text
src/test/java
│
├── base
│   └── BaseTest.java
│
├── FeatureFiles
│   └── purchaseE2E.feature
│
├── pages
│   ├── SignUp_Page.java
│   ├── Login_Page.java
│   ├── AddProduct_Page.java
│   ├── Cart_Page.java
│   ├── Purchase_Page.java
│   └── Logout_Page.java
│
├── runner
│   └── demoBlazeFlowRunner.java
│
├── stepdefinitions
│   └── PurchaseTestE2E.java
│
└── utilities
    └── AlertUtils.java
