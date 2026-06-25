# Java Internship Tasks

Collection of Java projects completed during internship.


## Projects : -
# "Basic Calculator"
A simple Java console application that performs basic arithmetic operations.

## How to Run
javac Calculator.java &&
java Calculator

## Supported Operations
- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/) — handles division by zero
- Number Guessing Game

# "Number Guessing Game"
- It's a number guessing game

## Features
- Program generates random number 1 to 100.
- User has 7 attempts to guess correct number.
- gives "Too High" and "Too Low" feedback

## Run
- javac NumberGuessingGame.java
- java NumberGuessingGame
- Employee Management System

# "Employee Management System"
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
# "Banking Application"
- its a simple Banking application

## Features
- User can Deposit, Withdraw and check Balance
- Handles Invalid Amount  and Insufficient funds

##  Run
- javac BankingApplication.java
- java BankingApplication