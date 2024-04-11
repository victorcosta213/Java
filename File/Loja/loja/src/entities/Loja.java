package entities;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Product> p;


    public Loja() {
        this.p = new ArrayList<>();
    }

    public void addProduct(Product p1){
        this.p.add(p1);
    }

    public void totalProduct(){
        for (Product itens: this.p){
            int i= 0;
            double val = itens.getPreco()*itens.getQuantidade();
            System.out.println(val);
            System.out.println();
        }

    }
}
