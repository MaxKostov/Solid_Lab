package domain.models;

import java.util.List;

public class Pepperoni extends Pizza {
    public Pepperoni(List<String> ingredients, double price) {
        super("Pepperoni", ingredients, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a spicy Pepperoni...");
    }
}
