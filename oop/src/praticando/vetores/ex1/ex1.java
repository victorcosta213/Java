package praticando.vetores.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double[] vetor= new double[3];
        int n= scanner.nextInt();

        for (int i=0;i<n;i++){
            vetor[i]= scanner.nextDouble();
        }
        double soma=0;

        for (int i=0; i<n;i++){
            soma += vetor[i];
        }

        double media= soma/n;

        System.out.printf("A altura media é:%.2f%n",media);

    }
}
