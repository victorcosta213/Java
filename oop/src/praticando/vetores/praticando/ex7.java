package praticando.vetores.praticando;

import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class ex7 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor? ");
        int n= sc.nextInt();
        double[] vetor= new double[n];

        for (int i=0; i< vetor.length;i++){
            System.out.print("Digite um número:");
            vetor[i]= sc.nextDouble();
        }
        double valor=0;
        for (int i=0; i< vetor.length;i++){
            valor += vetor[i];
        }

        double media= valor/ vetor.length;
        System.out.printf("MEDIA DOS VETORES: %.3f", media);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i=0; i< vetor.length;i++){
            if (vetor[i]< media){
                System.out.println(vetor[i]);
            }
        }

    }
}
