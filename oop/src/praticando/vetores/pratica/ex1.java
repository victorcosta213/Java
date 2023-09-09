package praticando.vetores.pratica;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] vet= new int[10];
        String[] vet1= new String[10];
        String[] vet2= new String[10];
        System.out.println("Quantos quarto você deseja alugar:");
        int n= sc.nextInt();

        for (int i=0;i < n;i++){
            System.out.println("Aluguel#"+(i+1));
            System.out.print("nome: ");
            sc.nextLine();
            String nome= sc.nextLine();
            System.out.print("Email: ");
            String email= sc.next();
            System.out.print("Quarto: ");
            int room= sc.nextInt();
            clientes in= new clientes();
            in.setNome(nome);
            in.setEmail(email);
            in.setQuarto(room);
            vet[room]= in.getQuarto();
            vet1[room]= in.getNome();
            vet2[room]= in.getEmail();


        }

        for (int i=0; i< vet.length;i++){

            if(vet1[i]!=null){
            System.out.print(vet[i]+": ");
            System.out.print(vet1[i]+", ");
            System.out.println(vet2[i]);}


        }



    }
}
