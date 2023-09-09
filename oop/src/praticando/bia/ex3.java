package praticando.bia;

import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite quantos termos você deseja colocar: ");
        int n= sc.nextInt();
        int[] vet= new int[n];

      for (int i=0;i< vet.length;i++){
          System.out.println("Digite um número:");
          vet[i]= sc.nextInt();

      }
        System.out.println("Numeros negativos");

        for (int i=0;i<= vet.length;i++){
            if (vet[i] < 0){
               System.out.println(vet[i]);
           }
        }


    }
    }

