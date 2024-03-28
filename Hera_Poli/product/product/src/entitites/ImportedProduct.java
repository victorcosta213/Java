package entitites;

public class ImportedProduct extends Product{
    private double customsFree;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

    public double getCustomsFree() {
        return customsFree;
    }

    public void setCustomsFree(double customsFree) {
        this.customsFree = customsFree;
    }

    public double totalPrice(){
        return getPrice() + customsFree;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()+" $"+totalPrice()+" (Custom free: $"+this.getCustomsFree()+")");
        return sb.toString();
    }
}
