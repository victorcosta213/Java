package entities;

public class OrderItem {

    private Product p1;

    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(int quantity, double price, Product p1) {
        this.quantity = quantity;
        this.price = price;
        this.p1= p1;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Product getP1() {
        return p1;
    }

    public void setP1(Product p1) {
        this.p1 = p1;
    }

    public double subTotal(){
        return this.quantity * this.price;
    }
}
