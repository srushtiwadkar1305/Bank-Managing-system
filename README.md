### 🏦 Bank Management System

A comprehensive Banking Management System developed using **Java, Swing/AWT, JDBC, and MySQL** that simulates real-world banking operations through an interactive graphical user interface. The application allows users to create accounts, securely log in, manage transactions, and view account details with persistent database storage.

---

## 📌 Project Overview

The Bank Management System is a desktop-based banking application designed to automate essential banking operations. It provides customers with a secure and user-friendly platform to perform transactions such as deposits, withdrawals, balance inquiries, fast cash withdrawals, and mini statement generation.

The project follows **Object-Oriented Programming (OOP)** principles to ensure scalability, maintainability, and code reusability while utilizing **JDBC** for seamless database connectivity with MySQL.

---

## ✨ Key Features

### 🔐 Secure User Authentication

* New user registration (Multi-Step Signup Process)
* Secure login system
* PIN verification and management
* Account creation with customer details

### 💳 Banking Operations

* Balance Inquiry
* Cash Deposit
* Cash Withdrawal
* Fast Cash Transactions
* PIN Change Facility
* Mini Statement Generation
* Transaction History Tracking

### 🗄️ Database Management

* MySQL database integration
* Persistent customer records
* Transaction storage and retrieval
* Real-time balance updates

### 🖥️ Interactive GUI

* Built using Java Swing & AWT
* ATM-inspired user interface
* User-friendly navigation
* Responsive form validations

### 🧩 Object-Oriented Design

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism
* Modular and maintainable architecture

---

## 🛠️ Technology Stack

| Technology   | Purpose                      |
| ------------ | ---------------------------- |
| Java         | Core Application Development |
| Swing & AWT  | Graphical User Interface     |
| MySQL        | Database Management          |
| JDBC         | Database Connectivity        |
| OOP Concepts | Code Structure & Reusability |

---

## 📂 Project Structure

```text
src/
└── bank/management/system/
    ├── BalanceEnquiry.java
    ├── Connn.java
    ├── Deposit.java
    ├── FastCash.java
    ├── Login.java
    ├── Main_Class.java
    ├── Mini.java
    ├── Pin.java
    ├── Signup.java
    ├── Signup2.java
    ├── Signup3.java
    └── Withdrawl.java

icon/
├── atm2.png
├── backbg.png
├── bank.png
├── card.png
└── provider.png
```

---

## 🚀 Application Workflow

### 1️⃣ User Registration

* User fills personal information.
* Additional details are collected.
* Account type is selected.
* ATM card number and PIN are generated.

### 2️⃣ Login

* User enters Card Number and PIN.
* System validates credentials.
* Dashboard access is granted.

### 3️⃣ Banking Services

After successful login, users can:

* Deposit Money
* Withdraw Money
* Check Account Balance
* View Mini Statement
* Change PIN
* Use Fast Cash Facility

---

## 📸 Screenshots

### Login Screen

<img width="800" alt="Login Screen" src="screenshots/login.png">

### Signup Screen

<img width="800" alt="Signup Screen" src="screenshots/signup.png">

### Main Menu

<img width="800" alt="Main Menu" src="screenshots/mainmenu.png">

### Deposit Module

<img width="800" alt="Deposit Module" src="screenshots/deposit.png">

### Withdrawal Module

<img width="800" alt="Withdrawal Module" src="screenshots/withdrawal.png">

### Mini Statement

<img width="800" alt="Mini Statement" src="screenshots/ministatement.png">

> Replace image paths with your actual screenshots from the project.

---

## ⚙️ Installation & Setup

### Prerequisites

* Java JDK 8 or Higher
* MySQL Server
* JDBC Driver
* IDE (IntelliJ IDEA, Eclipse, NetBeans)

### Clone Repository

```bash
git clone https://github.com/yourusername/bank-management-system.git
```

### Configure Database

1. Create a MySQL database.
2. Import required tables.
3. Update database credentials inside:

```java
Connn.java
```

Example:

```java
Connection c = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/bankmanagementsystem",
    "username",
    "password"
);
```

### Run Application

```bash
Run Login.java
```

The application will start with the Login Screen.

---

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

* Java Desktop Application Development
* JDBC Connectivity
* MySQL Database Design
* GUI Development using Swing & AWT
* Object-Oriented Programming
* Event Handling
* Database Transactions
* Software Architecture Design

---

## 🔮 Future Enhancements

* Online Fund Transfer
* Email Notifications
* Account Statement PDF Export
* Role-Based Access Control
* Password Encryption
* Mobile Banking Integration
* Transaction Analytics Dashboard

---

## 👩‍💻 Author

**Srushti Wadkar**

BCA Student | Java Developer | Full Stack Development Enthusiast

📧 Email: srushtiwadkar1305@gmail.com

🔗 LinkedIn: www.linkedin.com/in/srushti-wadkar-19b142301

---

## ⭐ Support

If you found this project useful, consider giving it a **Star ⭐** on GitHub.

Feedback, suggestions, and contributions are always welcome!
