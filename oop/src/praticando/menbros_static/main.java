package praticando.menbros_static;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quanto está o dolar:");
        double valor= scanner.nextDouble();;
        System.out.println("Quantos dolares você deseja:");
        double quantidade= scanner.nextDouble();

        double total=conversor.converter(valor,quantidade);
        System.out.println("valor total:R$ "+total );




        scanner.close();
    }
}
