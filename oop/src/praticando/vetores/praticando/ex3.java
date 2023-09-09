package praticando.vetores.praticando;

import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n= scanner.nextInt();
        String[] nomes= new String[n];
        double[] idade= new double[n];
        double[] altura= new double[n];

        for (int i=0; i<n;i++){
            System.out.print("Nome:");
            nomes[i]= scanner.next();
            System.out.print("idade:");
            idade[i]= scanner.nextInt();
            System.out.print("altura::");
            altura[i]= scanner.nextDouble();
        }

        double hm= 0;
        for (int i=0; i<n;i++){
            hm += altura[i];
        }

        double menor=0;
        for (int i=0; i<n;i++){
            if (idade[i]<16){
                menor+=1;
            }
        }
        double media= hm/n;
        System.out.println("A media de altura é: "+ media);
        double mediaP= (menor/n)*100;
        System.out.println("Pessoas com menos de 16 anos: "+ mediaP+"%");
        for (int i=0; i<n;i++){
            if (idade[i]<16){
                System.out.println(nomes[i]);
            }
        }


    }
}
