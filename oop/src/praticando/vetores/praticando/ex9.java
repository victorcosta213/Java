package praticando.vetores.praticando;

import java.util.Scanner;

public class ex9 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar: ");
        int n= sc.nextInt();
        String[] nome= new String[n];
        int[] idade= new int[n];
        int comp=0;
        String velho=" ";


        for (int i=0; i<n;i++){
            int indice= i+1;
            System.out.println("Dados da "+indice+"a pessoa");
            System.out.print("Nome: ");
            nome[i]= sc.next();
            System.out.print("Idade: ");
            idade[i]= sc.nextInt();
                    if (idade[i]>comp){
                        comp= idade[i];
                        velho= nome[i];
                    }
        }

        System.out.println("PESSOA MAIS VELHA: "+velho);




    }
}
