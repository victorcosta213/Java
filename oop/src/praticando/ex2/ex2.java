package praticando.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String name= scanner.nextLine();
        System.out.print("Preço do produto: ");
        double price= scanner.nextDouble();

        product estoque= new product(name,price);

        estoque.setName("computador");

        System.out.println();
        System.out.println(estoque.toString());
        System.out.print("Digite a quantidade que entrou no estoque: ");
        estoque.addproducts(scanner.nextInt());
        System.out.println();

        System.out.println(estoque.toString());
        System.out.print("Digite a quantidade que saiu no estoque: ");
        estoque.removeproducts(scanner.nextInt());
        System.out.println();

        System.out.println(estoque.toString());

        scanner.close();
    }
}
