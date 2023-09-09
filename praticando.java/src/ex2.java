import java.util.Scanner;

public class ex2 {
    public static void main(String[]args){
        int n;
        System.out.println("Digite um número:");
        Scanner numeros= new Scanner(System.in);
        n= numeros.nextInt();
            if (n>0){
                System.out.println("Esse número é positivo.");
            }else{
                System.out.println("Esse número é negativo.");
            }
    }
}
