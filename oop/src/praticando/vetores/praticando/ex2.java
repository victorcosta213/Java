package praticando.vetores.praticando;

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Quantos números você deseja digitar:");
        int n= sc.nextInt();
        double[] vetor= new double[n];

        for (int i=0; i< vetor.length;i++){
            vetor[i]= sc.nextDouble();
        }

        double soma=0;

        for (int i=0; i< vetor.length;i++){
            soma += vetor[i];
        }
        double media= soma/ vetor.length;

        for (int i=0; i< vetor.length;i++){
            System.out.printf("%.1f ",vetor[i]);
        }
        System.out.println();
        System.out.println("SOMA:"+soma);
        System.out.println("MEDIA:"+ media);
    }
}
