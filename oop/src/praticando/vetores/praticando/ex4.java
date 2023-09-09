package praticando.vetores.praticando;

import java.util.Scanner;

public class ex4 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantos números você vai digitar: ");
        int n= sc.nextInt();
        int[] vetor= new int[n];

        for (int i=0; i< vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i]= sc.nextInt();
        }
        int quantidade=0;
        System.out.println("NÚMEROS PARES:");
        for (int i=0; i< vetor.length;i++){
           if (vetor[i]%2==0){
               System.out.print(vetor[i]+" ");
               quantidade+=1;
           }

        }
        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE NÚMERO PARES:"+ quantidade);
        sc.close();
    }
}
