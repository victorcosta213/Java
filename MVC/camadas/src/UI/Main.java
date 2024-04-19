package UI;

import entities.Conta;
import exception.ContaJaExisteException;
import exception.ContaNaoEncontradaException;
import negocio.Fachada;
import negocio.IFachada;

import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Main {
    private static IFachada cliente = new Fachada();

    public static void main(String[] args) throws ContaJaExisteException, ContaNaoEncontradaException {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while (i!=0){
            System.out.println("-------------- MENU ---------------");
            System.out.println("1- Inserir Conta");
            System.out.println("2- Remover Conta");
            System.out.println("3- Alterar Conta");
            System.out.println("4- Buscar Conta");
            System.out.println("5- Relatorio de todas contas");
            System.out.println("6- Sair");
            System.out.print("Escolha uma opção: ");
            short op =sc.nextShort();
            switch (op){
                case 1:
                    try {
                        double saldo = 0;
                        System.out.print("Numero da Conta: ");
                        int numeroConta = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Titular da Conta: ");
                        String titular = sc.nextLine();
                        System.out.print("Deseja fazer um deposito inicial(s/n): ");
                        char dc = sc.next().charAt(0);
                        if (dc == 's'){
                            System.out.print("Insira o valor inicial: R$ ");
                            saldo = sc.nextDouble();
                        }
                        Conta c = new Conta(numeroConta,titular,saldo);
                        cliente.inserirConta(c);

                    }catch (ContaJaExisteException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    try{
                        System.out.print("Numero da Conta: ");
                        int numero=sc.nextInt();
                        cliente.removerConta(numero);
                        System.out.println("Conta removida com sucesso!");
                    }catch (ConcurrentModificationException e){
                        System.out.println("Lista de contas está vazia!");
                    }
                    break;

                case 3:

                    System.out.print("Digite o numero da conta que deseja alterar: ");
                    int numC = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o nome do titular da conta: ");
                    String nome = sc.nextLine();
                    Conta c1 = new Conta(numC,nome,0);
                    cliente.alterarConta(c1);
                    break;
                case 4:
                    try {
                        System.out.print("Numero da Conta: ");
                        int num =sc.nextInt();
                        System.out.println(cliente.buscarConta(num).getTitular()+"\nSaldo: R$"+cliente.buscarConta(num).getSaldo());

                    }catch (ContaNaoEncontradaException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                   Conta[] lista= cliente.buscartodos();
                   for (int a=0; a<lista.length; a++){
                       System.out.println("---------------------------------------");
                       System.out.println("titular: "+lista[a].getTitular());
                       System.out.println("Numero: "+ lista[a].getNumero());
                       System.out.println("Saldo R$"+lista[a].getSaldo());
                       System.out.println("----------------------------------------");
                       System.out.println();
                   }
                   break;
                case 6:
                    System.out.println("Saindo...");
                    i=0;
                    break;
                default:
                    System.out.println("Opção indisponivel!");
            }
            System.out.println();
        }
    }
}