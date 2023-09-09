package praticando.vetores.pratica.correcao;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantos quartos você deseja alugar:");
        int n= sc.nextInt();
        rent[] rents = new rent[10];

        for (int i=1;i<=n;i++){
            System.out.println();
            System.out.println("Rent#"+i);
            System.out.print("nome: ");
            sc.nextLine();
            String nome= sc.nextLine();
            System.out.print("Email: ");
            String email= sc.next();
            System.out.print("Número do quarto: ");
            int numeroquarto= sc.nextInt();

            rents[numeroquarto]= new rent(nome,email);
        }

        for (int i=1; i<10;i++){
            if(rents[i]!=null){
            System.out.println(i +":"+ rents[i]);}
        }


    }
}
