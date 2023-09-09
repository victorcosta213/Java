package praticando.ex6;

import java.util.Scanner;

public class cliente {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        Banco cliente;
        System.out.println("Digite o número da sua conta:");
        int conta= scanner.nextInt();
        System.out.println("Digite o seu nome:");
        scanner.nextLine();
        String nome= scanner.nextLine();
        System.out.println("Deseja realizar um deposito inicial (s/n):");
        char reponse= scanner.next().charAt(0);
            if (reponse== 's'){
                System.out.println("Qual o valor do deposito inicial:");
                double inicialDeposito= scanner.nextDouble();
                cliente = new Banco(conta,nome,inicialDeposito);
            }else{
                cliente= new Banco(conta,nome);
            }

            System.out.println("numero da conta: "+ cliente.getAgencia() +", Cliente:"+ cliente.getNome() +", Saldo:"+ cliente.getDeposito());
        System.out.println("Qual o valor do deposito:");
        double deposito= scanner.nextDouble();
        cliente.deposito(deposito);
        System.out.println("numero da conta: "+ cliente.getAgencia() +", Cliente:"+ cliente.getNome() +", Saldo:"+ cliente.getDeposito());
        System.out.println("Quanto deseja sacar:");
        double saque= scanner.nextDouble();
        cliente.saque(saque);
        System.out.println("numero da conta: "+ cliente.getAgencia() +", Cliente:"+ cliente.getNome() +", Saldo:"+ cliente.getDeposito());
    }
}
