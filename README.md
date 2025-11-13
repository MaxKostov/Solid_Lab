
---
# Creational Design Patterns – Pizza Shop
### Author: Maxim Costov FAF-232

---

## Overview

**Pizza Shop** is a Java-based demonstration project designed to illustrate the practical application of three key **Creational Design Patterns** — **Singleton**, **Builder**, and **Factory Method**.  
The system models a simple pizza creation and ordering process that demonstrates efficient and flexible object instantiation mechanisms while respecting the **SOLID principles**.

---

## Objectives

The primary goals of this project are to:
1. Study and understand the **Creational Design Patterns**.  
2. Choose a domain (Pizza Shop) and define its main entities.  
3. Apply at least three creational patterns for flexible and maintainable object instantiation.  
4. Ensure the solution remains modular, extensible, and adheres to SOLID principles.

---

## Implemented Creational Patterns

### 1. **Singleton**
**Class:** `singleton.Kitchen`  
Ensures there is only one shared instance of the kitchen across the entire system.  
It also provides centralized access to the `PizzaFactory`, preventing multiple factory instances.

**Key benefit:** Guarantees consistent creation behavior and controlled resource access.

---

### 2. **Factory Method**
**Classes:** `factory.PizzaFactory`, `factory.PizzaType`  
The `PizzaFactory` delegates the creation of specific pizza types to the `PizzaType` enum, which defines its own creation logic.  
This avoids conditionals (no `switch` or `if`) and ensures open/closed extensibility.

**Key benefit:** Adding new pizza types (e.g., `Hawaiian`) requires no modification to the factory.

---

### 3. **Builder**
**Class:** `builder.PizzaBuilder`  
Used to construct complex pizza objects step-by-step by adding ingredients, type, and price.  
It separates the construction logic from the pizza representation and integrates cleanly with the `PizzaFactory`.

**Key benefit:** Provides a flexible and readable object creation process.

---

### Sample Output

```
Baking a classic Margherita...
Margherita pizza with [Tomato Sauce, Mozzarella, Basil] — $8.5
Baking a spicy Pepperoni...
Pepperoni pizza with [Tomato Sauce, Mozzarella, Pepperoni] — $9.5
Baking a healthy Veggie pizza...
Veggie pizza with [Tomato Sauce, Mozzarella, Olives, Peppers] — $9.0
```

---

## Compilation and Execution

### Prerequisites

* **Java 17** or higher
* A text editor or IDE (IntelliJ IDEA, VS Code, etc.)

### Steps

1. Clone the repository:

2. Navigate to the project folder:

   ```bash
   cd creational-pizza-shop
   ```
3. Compile the source files:

   ```bash
   javac */*.java */*/*.java
   ```
4. Run the main class:

   ```bash
   java client.Main
   ```

---

## Design Summary

| Pattern            | Class(es)                   | Purpose                                                   |
| ------------------ |-----------------------------| --------------------------------------------------------- |
| **Singleton**      | `KitchenSingleton`          | Ensures a single global access point to the pizza factory |
| **Builder**        | `PizzaBuilder`              | Builds pizzas in a flexible, step-by-step manner          |
| **Factory Method** | `PizzaFactory`, `PizzaType` | Creates pizza objects without explicit conditionals       |


