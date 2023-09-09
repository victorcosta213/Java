package praticando.vetores.praticando;

import java.util.Scanner;

public class ex10 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados?");
        int n= sc.nextInt();
        String[] nome= new String[n];
        double[] n1= new double[n];
        double[] n2= new double[n];
        double media;

        for (int i=0; i<n;i++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            nome[i]= sc.nextLine();
            System.out.println();
            n1[i]= sc.nextDouble();
            n2[i]= sc.nextDouble();

        }

        System.out.println("Alunos aprovados:");
        for (int i=0; i<n;i++){
            media= (n1[i] + n2[i])/2;
            if (media >=6){
                System.out.println(nome[i]);
            }
        }
        sc.close();
    }
}
