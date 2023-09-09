import java.util.Scanner;

public class ex4 {
    public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        double n= scanner.nextDouble();
        if (n%2==1){
            for (int i=1;i<=n;i=i+2){
                System.out.println(i);
            } }else {
                for (int i=1;i<=n;i=i+2){
                    System.out.println(i);
            }
        }
        scanner.close();
        }

}
