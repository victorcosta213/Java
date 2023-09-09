import java.util.Scanner;

public class ex2_1 {
    public static void main(String [] args){
        System.out.println("Digite um número:");
        Scanner par_impar= new Scanner(System.in);
        int n= par_impar.nextInt();
        if (n%2==0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é impar");
        }

    }
}
