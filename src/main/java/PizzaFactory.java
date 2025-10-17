public class PizzaFactory {
    public Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "margherita" -> new Margherita();
            case "pepperoni" -> new Pepperoni();
            default -> throw new IllegalArgumentException("Unknown pizza type: " + type);
        };
    }
}
