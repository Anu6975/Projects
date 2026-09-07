# DemoBlaze E-Commerce Website - End-to-End Automation Framework

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

```

### Framework Components

- **Base** - Contains the base test class and common test setup.
- **Pages** - Contains page-specific locators and reusable methods following the Page Object Model.
- **FeatureFiles** - Contains BDD scenarios written using Gherkin syntax.
- **Step Definitions** - Connects Cucumber feature steps with the corresponding automation code.
- **Runner** - Contains the Cucumber TestNG runner used to execute the scenarios.
- **Utilities** - Contains reusable utility methods used in the framework.

---

## ▶️ How to Run

### Prerequisites

- Java JDK
- Maven
- IntelliJ IDEA or another Java IDE
- Git
- Supported web browser

### Steps

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Allow Maven to download the required dependencies.
4. Verify the browser and WebDriver configuration.
5. Run the Cucumber TestNG runner.

If Maven test execution is configured in the project, the tests can also be executed using:

```bash
mvn test
```
