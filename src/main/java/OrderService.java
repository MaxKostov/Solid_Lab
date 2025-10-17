public class OrderService {
    private final PizzaFactory pizzaFactory;
    private final ReceiptPrinterInterface printer;

    public OrderService(PizzaFactory pizzaFactory, ReceiptPrinterInterface printer) {
        this.pizzaFactory = pizzaFactory;
        this.printer = printer;
    }

    public void orderPizza(String type) {
        Pizza pizza = pizzaFactory.createPizza(type);
        System.out.println("Preparing " + pizza.getName() + "...");
        printer.printReceipt(pizza);
    }
}
