package aplication;

import entitites.ImportedProduct;
import entitites.Product;
import entitites.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> items = new ArrayList<>();

        System.out.print("Enter the number of product: ");
        int op = sc.nextInt();

        for (int i =0; i<op; i++){
            System.out.println("Product #"+(i+1)+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            String r = sc.next();
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("price: ");
            double price = sc.nextDouble();
            if (r.equals("c")){
                items.add(new Product(name,price));
            } else if (r.equals("u")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                items.add(new UsedProduct(name,price,sdf.parse(sc.next())));
            } else if (r.equals("i")){
                System.out.print("Customs fee: ");
                items.add(new ImportedProduct(name, price, sc.nextDouble()));
            }else{
                System.out.println("Opção indisponivel!");
            }
        }


        System.out.println("PRICE TAGS:");
        for (Product i: items){
            System.out.println(i.priceTag());
        }
    }
}