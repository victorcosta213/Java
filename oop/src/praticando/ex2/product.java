package praticando.ex2;

public class product {

    private String name;
    private double price=0;
    private double quantity=0;

    public product(){}
    public product(String name, double price, double quantity){
        this.name= name;
        this.price=price;
        this.quantity= quantity;
    }

    public product(String name, double price){
        this.name= name;
        this.price=price;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void addproducts (int quantidade){
        quantity= quantity+quantidade;
    }
    public void removeproducts (int quantidade){
        quantity= quantity-quantidade;
    }

    public double valortotal(){
        return price*quantity;

    }
    public String toString(){
        return name +" ,R$ "+ String.format("%.2f",price)+", Unidade:"+ quantity+", Total R$ "+String.format("%.2f",valortotal()) ;
    }
}
