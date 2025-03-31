public class CustomerInfo {
    private String name;
    private String address;
    private String email;

    public CustomerInfo(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void printCustomerInfo() {
        System.out.println("Customer: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }
}
