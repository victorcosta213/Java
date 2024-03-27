package aplication;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enuns.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name= sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY):  ");
        String bdate = sc.next();
        Cliente c1 = new Cliente(name,email,sdf.parse(bdate));

        System.out.println("Enter ordem Data: ");
        System.out.print("Status: ");
        Order o1= new Order(new Date(),OrderStatus.valueOf(sc.next()),c1);
        System.out.print("How many items to this order? ");
        int op = sc.nextInt();


        for (int i=0; i< op;i++){
            System.out.println("Enter #"+(i+1)+" item data: ");
            System.out.print("Product name: ");
            String np= sc.next();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int q = sc.nextInt();
            Product p1 = new Product(np,price);
            OrderItem orderI = new OrderItem(q,price,p1);
            o1.addItem(orderI);

        }

        System.out.println(o1);;




    }
}