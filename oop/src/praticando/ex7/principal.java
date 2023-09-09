package praticando.ex7;

import java.util.Scanner;

public class principal {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        cliente a = new cliente();
        System.out.print("Digite sua agência: ");
        a.setAg(sc.nextInt());
        System.out.print("Digite sua conta: ");
        a.setConta(sc.nextInt());
        System.out.println("O saldo da conta = "+ a.getSaldo());
        System.out.print("Deseja adicionar algum valor(s/n): ");
        String op= sc.next();
            if (op.equals("s")){
                System.out.print("Digite o valor: ");
                a.addsaldo(sc.nextDouble());
                System.out.println("Seu saldo agora é: R$"+ a.getSaldo());
            } else{
                System.out.println("Consulta finalizada!");
            }



    }
}
