package praticando.vetores.praticando.bia2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Qual o salario: R$");
        double sal= sc.nextDouble();
        System.out.print("Digite o valor das contas: R$");
        double conta = sc.nextDouble();
        System.out.print("Digite o valor do curso: 12 x ");
        double curso= sc.nextDouble();
        double totalcurso= curso * 12;
        System.out.println();

        for (int i=1; i<=12;i++){
            conta = (conta*1.07);
            System.out.printf("Dispesas do mês "+i+" Total = R$ %.2f%n",conta);
            double saldo = sal - (conta + curso);
            System.out.printf("Saldo mensal: R$ %.2f%n", saldo);
            System.out.println();
        }
        double dispesas= conta + totalcurso;

        if (sal< dispesas){
            System.out.println("Salario insuficiente");
        } else{
            System.out.println("Salario suficiente");
        }

    }
}
