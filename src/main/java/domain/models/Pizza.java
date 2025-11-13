package domain.models;

import java.util.List;

public abstract class Pizza {
    protected String name;
    protected List<String> ingredients;
    protected double price;

    public Pizza(String name, List<String> ingredients, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
    }

    public abstract void bake();

    @Override
    public String toString() {
        return name + " pizza with " + ingredients + " — $" + price;
    }
}
