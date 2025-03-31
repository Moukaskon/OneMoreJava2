import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;
    private double totalPrice;

    private String customerName;
    private String customerAddress;
    private String customerEmail;

    private String paymentMethod;
    private boolean paymentStatus;

    public Order(String orderId, List<String> items, double totalPrice,
                 String customerName, String customerAddress, String customerEmail,
                 String paymentMethod, boolean paymentStatus) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Items: " + items);
        System.out.println("Total Price: $" + totalPrice);
        printCustomerInfo();
        processPayment();
    }

    public void printCustomerInfo() {
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("Email: " + customerEmail);
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
