import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;
    private double totalPrice;

    private CustomerInfo customerInfo;
    private PaymentProcessor paymentProcessor;

    public Order(String orderId, List<String> items, double totalPrice,
                 CustomerInfo customerInfo, PaymentProcessor paymentProcessor) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.customerInfo = customerInfo;
        this.paymentProcessor = paymentProcessor;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
        customerInfo.printCustomerInfo();
        paymentProcessor.processPayment();
    }
}
