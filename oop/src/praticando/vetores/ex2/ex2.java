package praticando.vetores.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        produto[] vetor= new produto[n];

        for (int i=0;i< vetor.length;i++){
            scanner.nextLine();
            String nome= scanner.nextLine();
            double preco= scanner.nextDouble();
            vetor[i]= new produto(nome,preco);
        }

        double soma=0;
        for (int i=0;i< vetor.length;i++){
            soma+= vetor[i].getPreco();
        }

        double media= soma/ vetor.length;
        System.out.println("A media de preço:"+media);

    }

}
