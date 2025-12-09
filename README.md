# 🧩 Java Singleton Demo – ConfigManager & Logger

This is a simple Java project demonstrating the **Singleton Design Pattern** using two practical components commonly used in automation frameworks:

- **ConfigManager** – Reads `config.properties` exactly once and shares configuration across the entire project.
- **LoggerSingleton** – A single shared logger instance for uniform logging.

This project is perfect for beginners learning Java design patterns and for QA automation engineers building frameworks.

---

## 🚀 Features

### ⭐ ConfigManager (Singleton)
- Loads `config.properties` only once.
- Uses ClassLoader to fetch configuration from the classpath.
- Provides easy `get(key)` method to fetch values.
- Prevents repeated I/O operations → faster & memory-efficient.

### ⭐ LoggerSingleton (Singleton)
- Ensures only one logger exists throughout the app.
- Simple, fast console-logging utility.
- Easily extendable (INFO, ERROR, DEBUG levels can be added later).

### ⭐ App.java Demo
- Demonstrates how both Singleton classes behave.
- Shows that multiple calls still return the **same instance**.

---

## 📂 Project Structure

singleton-config-logger-demo/
│
├── src/
│ └── com/demo/singleton/
│ ├── App.java
│ ├── ConfigManager.java
│ └── LoggerSingleton.java
│
├── config.properties
└── README.md


## ▶️ Running the Project

Run the `App.java` file from your IDE (Eclipse, IntelliJ, VS Code, etc.)

**Expected output:**

[LOG] Application Started
[LOG] URL from config: https://google.com

[LOG] Browser from config: chrome
[LOG] Is config and config2 same instance? true


This proves the Singleton pattern is working.

---

## 🎯 Why Singleton in Automation?

Singleton is commonly used in automation frameworks for:

- Configuration management  
- Logging  
- Driver factories (careful with parallel execution)  
- Global utilities  

It reduces:
- Memory usage  
- Configuration duplication  
- Inconsistent object creation  

---

## 🛠 Technologies Used

- Java 8+  
- Eclipse (or any IDE)  
- Properties file for configuration  

---

## 🚧 Future Enhancements

- Add log levels (INFO, ERROR, DEBUG)
- Add thread-safe Singleton (double-checked locking)
- Add environment-based configuration (dev/test/prod)
- Add FileLogger to write logs to a `.log` file

---

## 📘 License

This project is released under the **MIT License**.

---

## 🤝 Contributions

Feel free to fork this repo, raise issues, or submit pull requests.  
Suggestions and improvements are always welcome!


