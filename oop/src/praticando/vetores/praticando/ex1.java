package praticando.vetores.praticando;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Quantos números voce vai digitar:");
        int n= sc.nextInt();
        int[] vetor= new int[n];

        for (int i=0; i< vetor.length;i++){
            vetor[i]= sc.nextInt();
        }
        System.out.println("Numeros negativos:");

        for (int i =0; i< vetor.length;i++){
            if(vetor[i]<0){
                System.out.println(vetor[i]);
            }
        }
        sc.close();
    }
}
