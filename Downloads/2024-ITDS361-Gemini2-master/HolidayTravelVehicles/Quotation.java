public class Quotation {
    private String vehicle;
    private double price;

    public Quotation(String vehicle, double price) {
        this.vehicle = vehicle;
        this.price = price;
    }

    public void displayQuotation() {
        System.out.println("Quotation for " + vehicle + ": $" + price);
    }
}