import java.util.Scanner;

public class ex1 {

    public static void main (String[]args){
        Scanner numeros= new Scanner(System.in);
        System.out.println("Digite um número:");
        int n= numeros.nextInt();
        System.out.println("Digite outro número");
        int n1= numeros.nextInt();
        int soma;
        soma= n + n1;

        System.out.println("A soma de "+ n +"+"+ n1 +"= "+soma);


    }
}
