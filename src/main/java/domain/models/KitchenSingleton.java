package domain.models;

import domain.factory.PizzaFactory;

public class KitchenSingleton {
    private static KitchenSingleton instance;
    private final PizzaFactory pizzaFactory;

    private KitchenSingleton() {
        this.pizzaFactory = new PizzaFactory();
    }

    public static synchronized KitchenSingleton getInstance() {
        if (instance == null) {
            instance = new KitchenSingleton();
        }
        return instance;
    }

    public PizzaFactory getPizzaFactory() {
        return pizzaFactory;
    }
}
