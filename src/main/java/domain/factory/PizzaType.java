package domain.factory;

import domain.models.Margherita;
import domain.models.Pepperoni;
import domain.models.Pizza;
import domain.models.Veggie;

import java.util.List;

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
