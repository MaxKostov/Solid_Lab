package domain.models;

import java.util.List;

public class Veggie extends Pizza {
    public Veggie(List<String> ingredients, double price) {
        super("Veggie", ingredients, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a healthy Veggie pizza...");
    }
}
