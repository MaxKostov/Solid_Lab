public class ReceiptPrinter implements ReceiptPrinterInterface {
    @Override
    public void printReceipt(Pizza pizza) {
        System.out.println("---- Receipt ----");
        System.out.println("Pizza: " + pizza.getName());
        System.out.println("Price: $" + pizza.getPrice());
        System.out.println("-----------------");
    }
}
