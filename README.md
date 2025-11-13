# Creational Design Patterns – Pizza Shop

## Author
Maxim Costov

---

## Objectives

* Get familiar with the **Creational Design Patterns** (Singleton, Builder, Factory Method).  
* Choose a specific domain — **Pizza Shop**.  
* Implement at least 3 creational patterns for the domain to create pizzas flexibly and maintainably.

---

## Used Design Patterns

* **Singleton** – `KitchenSingleton` ensures a single global kitchen instance.  
* **Builder** – `PizzaBuilder` allows step-by-step creation of pizzas with customizable ingredients and price.  
* **Factory Method** – `PizzaFactory` and `PizzaType` create specific pizza types without `switch` statements.

---

## Implementation

The system models a pizza ordering process where pizzas can be built, baked, and printed.  
The **Kitchen singleton** provides a centralized access to the `PizzaFactory`, which delegates pizza creation to the **PizzaType enum**.  
The **PizzaBuilder** allows creating pizzas step-by-step with flexible ingredients and pricing.  
The design follows **SOLID principles**, especially **Single Responsibility (SRP)**, **Open/Closed (OCP)**, and **Dependency Inversion (DIP)**.

### Example Snippets

**PizzaType enum (Factory Method):**
```java
public enum PizzaType {
    MARGHERITA {
        @Override
        public Pizza create(List<String> ingredients, double price) {
            return new Margherita(ingredients, price);
        }
    },
    PEPPERONI {
        @Override
        public Pizza create(List<String> ingredients, double price) {
            return new Pepperoni(ingredients, price);
        }
    },
    VEGGIE {
        @Override
        public Pizza create(List<String> ingredients, double price) {
            return new Veggie(ingredients, price);
        }
    };

    public abstract Pizza create(List<String> ingredients, double price);
}
````

**PizzaBuilder class:**

```java
public class PizzaBuilder {
    private PizzaType type;
    private List<String> ingredients = new ArrayList<>();
    private double price;

    public PizzaBuilder type(PizzaType type) { this.type = type; return this; }
    public PizzaBuilder addIngredient(String ing) { ingredients.add(ing); return this; }
    public PizzaBuilder price(double price) { this.price = price; return this; }

    public Pizza build() {
        Kitchen kitchen = Kitchen.getInstance();
        PizzaFactory factory = kitchen.getPizzaFactory();
        return factory.createPizza(type, ingredients, price);
    }
}
```

**Main class (client usage):**

```java
public class Main {
    public static void main(String[] args) {
        Pizza margherita = new PizzaBuilder()
                .type(PizzaType.MARGHERITA)
                .addIngredient("Tomato Sauce")
                .addIngredient("Mozzarella")
                .addIngredient("Basil")
                .price(8.50)
                .build();

        margherita.bake();
        System.out.println(margherita);
    }
}
```

---

## Conclusions / Screenshots / Results

The Pizza Shop project demonstrates the effective use of three **Creational Design Patterns**:

* **Singleton** – Centralized access to the kitchen and factory.
* **Builder** – Flexible pizza creation with varying ingredients and prices.
* **Factory Method** – Polymorphic instantiation of pizza types using enums.

The solution respects **SOLID principles**, ensures maintainability, and is easily extensible: adding new pizza types requires only creating a new class and updating the `PizzaType` enum.

**Sample Output:**

```
Baking a classic Margherita...
Margherita pizza with [Tomato Sauce, Mozzarella, Basil] — $8.5
```
