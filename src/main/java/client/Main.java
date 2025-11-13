package client;

import domain.models.Pizza;
import domain.factory.PizzaType;
import domain.models.PizzaBuilder;

public class Main {
    public static void main(String[] args) {

        Pizza margherita = new PizzaBuilder()
                .type(PizzaType.MARGHERITA)
                .addIngredient("Tomato Sauce")
                .addIngredient("Mozzarella")
                .addIngredient("Basil")
                .price(8.50)
                .build();

        Pizza pepperoni = new PizzaBuilder()
                .type(PizzaType.PEPPERONI)
                .addIngredient("Tomato Sauce")
                .addIngredient("Mozzarella")
                .addIngredient("Pepperoni")
                .price(9.50)
                .build();

        Pizza veggie = new PizzaBuilder()
                .type(PizzaType.VEGGIE)
                .addIngredient("Tomato Sauce")
                .addIngredient("Mozzarella")
                .addIngredient("Olives")
                .addIngredient("Peppers")
                .price(9.00)
                .build();

        margherita.bake();
        System.out.println(margherita);

        pepperoni.bake();
        System.out.println(pepperoni);

        veggie.bake();
        System.out.println(veggie);
    }
}
