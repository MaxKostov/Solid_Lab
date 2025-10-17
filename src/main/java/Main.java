public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        ReceiptPrinterInterface printer = new ReceiptPrinter();
        OrderService orderService = new OrderService(factory, printer);

        orderService.orderPizza("margherita");
        orderService.orderPizza("pepperoni");
    }
}
