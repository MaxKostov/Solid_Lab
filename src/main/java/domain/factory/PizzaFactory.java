package domain.factory;

import domain.models.Pizza;

import java.util.List;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type, List<String> ingredients, double price) {
        return type.create(ingredients, price);
    }
}
