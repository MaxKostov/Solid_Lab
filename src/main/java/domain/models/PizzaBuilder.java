package domain.models;

import domain.factory.PizzaFactory;
import domain.factory.PizzaType;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private PizzaType type;
    private final List<String> ingredients = new ArrayList<>();
    private double price;

    public PizzaBuilder type(PizzaType type) {
        this.type = type;
        return this;
    }

    public PizzaBuilder addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
        return this;
    }

    public PizzaBuilder price(double price) {
        this.price = price;
        return this;
    }

    public Pizza build() {
        KitchenSingleton kitchen = KitchenSingleton.getInstance();
        PizzaFactory factory = kitchen.getPizzaFactory();
        return factory.createPizza(type, ingredients, price);
    }
}
