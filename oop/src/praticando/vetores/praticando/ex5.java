package praticando.vetores.praticando;

import java.util.Scanner;

public class ex5 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n= sc.nextInt();
        int[] vetor= new int[n];
        int menor= Integer.MIN_VALUE;
        int posicao=0;

        for (int i=0; i<vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i]= sc.nextInt();
                if (vetor[i]>menor){
                    menor= vetor[i];
                    posicao= i;
                }
        }

        System.out.println("MAIOR VALOR: = "+ menor);
        System.out.println("POSICAO DO MAIOR VALOR = "+ posicao);


    }
}
