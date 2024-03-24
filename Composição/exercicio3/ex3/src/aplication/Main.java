package aplication;

import entities.Cliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.println("Name: ");
        String name= sc.nextLine();
        System.out.println("Email: ");
        String email = sc.next();
        System.out.println("Birth date (DD/MM/YYYY):  ");
        String bdate = sc.next();
        Cliente c1 = new Cliente(name,email,sdf.parse(bdate));

        System.out.println("Enter ordem Data: ");
        System.out.println();

    }
}