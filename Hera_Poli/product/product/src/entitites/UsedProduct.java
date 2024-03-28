package entitites;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsedProduct extends Product {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufacturedDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }


    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()+" (used) $"+this.getPrice()+" (Manufacture date: $"+sdf.format(manufacturedDate)+")");
        return sb.toString();
    }
}
