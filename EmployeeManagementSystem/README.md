# Employee Management System

A console-based Employee Management System built in Java demonstrating Object-Oriented Programming principles with full CRUD functionality.

## Features
- Add new employees (Name, Department, Salary)
- View all employees in a formatted table
- Update employee details
- Delete employees by ID
- Search employee by ID
- Input validation and error handling

## Concepts Used
- OOP (Classes, Encapsulation, Getters/Setters)
- ArrayList for in-memory data storage
- Exception Handling (InputMismatchException)
- Java Scanner for console input

## How to Run
```bash
cd src
javac *.java
java Main
```

## Project Structure
```
EmployeeManagementSystem/
├── src/
│   ├── Employee.java        # Employee model class
│   ├── EmployeeManager.java # CRUD operations
│   └── Main.java            # Entry point & UI
└── README.md
```