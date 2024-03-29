package aplication;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Quantos contribuintes? ");
        int op = sc.nextInt();
        System.out.println();

        for (int i=1;i<=op;i++){
            System.out.println("Contribuinte #"+i);
            System.out.print("Nome do contribuinte: ");
            String nome = sc.next();
            System.out.print("Renda anual: R$");
            double rendaAnual = sc.nextDouble();
            System.out.print("o contribuinte é pessoa Fisica ou pessoa juridica (F/J): ");
            char o = sc.next().charAt(0);
            if (o =='F'){
                System.out.print("Gasto com saúde: R$ ");
                double gastoSaude = sc.nextDouble();
                contribuintes.add(new PessoaFisica(nome,rendaAnual,gastoSaude));
            } else if (o =='J') {
                System.out.print("Número de funcionarios: ");
                int numeroFuncionarios = sc.nextInt();
                contribuintes.add(new PessoaJuridica(nome,rendaAnual,numeroFuncionarios));
            }else{
                System.out.println("Opção indisponivel!");
            }
            System.out.println();
        }

        for (Contribuinte i:contribuintes) {
            System.out.println("-------------------------");
            System.out.println(i.getNome());
            System.out.printf("Imposto pago R$%.2f \n",i.impostos());
            System.out.println("-------------------------");
            System.out.println();

        }

        double totalImposto = 0;
        for (Contribuinte a:contribuintes) {
            totalImposto += a.impostos();
        }
        System.out.println("Total de imposto arrecadado: R$"+ totalImposto);
    }
}