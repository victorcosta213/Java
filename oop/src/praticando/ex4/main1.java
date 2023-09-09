package praticando.ex4;

import java.util.Scanner;

public class main1 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        funcionario A= new funcionario();
        System.out.print("nome: ");
        A.nome= scanner.nextLine();
        System.out.print("Sálario bruto: ");
        A.salarioBruto= scanner.nextDouble();
        System.out.print("Imposto: ");
        A.imposto= scanner.nextDouble();

        System.out.println();
        System.out.println(A.nome +", R$"+ A.salarioLiquido());
        System.out.print("Qual o acrescimo: ");
        double acrescimo= scanner.nextDouble();
        A.Acrescimo(acrescimo);
        System.out.print(A.nome +", R$"+ A.salarioLiquido());


    }
}
