package domain.models;

import java.util.List;

public class Margherita extends Pizza {
    public Margherita(List<String> ingredients, double price) {
        super("Margherita", ingredients, price);
    }

    @Override
    public void bake() {
        System.out.println("Baking a classic Margherita...");
    }
}
