package praticando.ex5;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        aluno A= new aluno();
        System.out.println("Digite o nome do aluno(a):");
        String aluno= scanner.nextLine();
        System.out.println("Digite a primeira nota:");
        A.nota1= scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        A.nota2= scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        A.nota3= scanner.nextDouble();

        if (A.media()<60){
            double pontos = 60- A.media();
            System.out.println("A media foi:"+String.format("%.2f",A.media()) +" O aluno "+aluno+" não passou, faltou " +pontos+ " para passar.");
        } else {
            System.out.println("A media foi :"+String.format("%.2f",A.media())+" O aluno "+aluno+" passou");
        }




    }
}
