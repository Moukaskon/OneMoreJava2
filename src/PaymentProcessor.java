public class PaymentProcessor {
    private String paymentMethod;
    private boolean paymentStatus;

    public PaymentProcessor(String paymentMethod, boolean paymentStatus) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
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
