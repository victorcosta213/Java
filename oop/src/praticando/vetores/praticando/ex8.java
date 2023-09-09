package praticando.vetores.praticando;

import java.util.Scanner;

public class ex8 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n= sc.nextInt();
        double[] vetor= new double[n];

                for (int i=0; i< vetor.length;i++){
                    System.out.print("Digite um número: ");
                    vetor[i]= sc.nextDouble();
                }

        double soma=0;
        double div=0;
        String nao= "NENHUM NÚMERO PAR";

                for (int i=0; i<vetor.length;i++){
                    if (vetor[i]%2==0){
                        soma += vetor[i];
                        div +=1;
                    }
                }


        double mediaP= soma/ div;

        if (soma==0){
            System.out.println(nao);
        }  else {
            System.out.printf("MEDIA DOS PARES: %.1f", mediaP);
        }
    }
}
