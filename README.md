# SOLID Pizza Shop
## Overview

**SOLID Pizza Shop** is a Java-based demonstration project designed to illustrate the practical application of three key **SOLID principles** — **Single Responsibility (S)**, **Open/Closed (O)**, and **Dependency Inversion (D)**.  
The system models a simple pizza ordering process where pizzas can be created, ordered, and invoiced, while maintaining clean, extensible, and maintainable code.

---

## Objectives

The primary goal of this project is to showcase how object-oriented design principles can improve software structure by:
- Promoting separation of concerns  
- Enabling extensibility without modifying existing code  
- Reducing coupling between modules  

---

## Implemented SOLID Principles

### 1. **Single Responsibility Principle (SRP)**
Each class in the system has one clearly defined responsibility:
- `PizzaFactory` – Responsible solely for creating pizza objects  
- `OrderService` – Handles the pizza ordering process  
- `ReceiptPrinter` – Manages receipt printing  

This separation ensures high cohesion and easier maintenance.

---

### 2. **Open/Closed Principle (OCP)**
The system is designed to be **open for extension but closed for modification**.  

New pizza types (e.g., `Hawaiian`, `Veggie`) can be added simply by creating new classes that implement the `Pizza` interface — without altering existing code in the factory or service layers.

---

### 3. **Dependency Inversion Principle (DIP)**
High-level modules depend on abstractions rather than concrete implementations.  

`OrderService` interacts with the `Pizza` and `ReceiptPrinterInterface` interfaces, not with specific implementations.  
This decouples system components and makes it easier to modify or replace dependencies (e.g., using a different receipt printer).

---

## Project Structure

```

pizza-shop/  
├─ src/  
│ ├─ main/  
│ │ ├─ Pizza.java  
│ │ ├─ Margherita.java  
│ │ ├─ Pepperoni.java  
│ │ ├─ PizzaFactory.java  
│ │ ├─ ReceiptPrinterInterface.java  
│ │ ├─ ReceiptPrinter.java  
│ │ ├─ OrderService.java  
│ │ └─ Main.java

````

---

## Example Usage

### Main Class
```java
public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        ReceiptPrinterInterface printer = new ReceiptPrinter();
        OrderService orderService = new OrderService(factory, printer);

        orderService.orderPizza("margherita");
        orderService.orderPizza("pepperoni");
    }
}
````

### Sample Output

```
Preparing Margherita...
---- Receipt ----
Pizza: Margherita
Price: $7.99
-----------------
Preparing Pepperoni...
---- Receipt ----
Pizza: Pepperoni
Price: $9.49
-----------------
```

---