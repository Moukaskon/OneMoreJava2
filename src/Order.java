import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;
    private double totalPrice;

    private CustomerInfo customerInfo;

    private String paymentMethod;
    private boolean paymentStatus;

    public Order(String orderId, List<String> items, double totalPrice,
                CustomerInfo customerInfo, String paymentMethod, boolean paymentStatus) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.customerInfo = customerInfo;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
        customerInfo.printCustomerInfo();
        processPayment();
    }

    public void processPayment() {
        if (!paymentStatus) {
            System.out.println("Processing payment via " + paymentMethod);
            paymentStatus = true;
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment already completed.");
        }
    }
}
