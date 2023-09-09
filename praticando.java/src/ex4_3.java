import java.util.Scanner;

public class ex4_3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        int n= scanner.nextInt();

        for (int i =0; i<=n; i++){
            System.out.println("Digite um número:");
            double a= scanner.nextDouble();
            System.out.println("Digite um número:");
            double b= scanner.nextDouble();
            double div= a/b;
                    if (a==0){
                        System.out.println("Divisão impossivel");
                    } else {
                        System.out.println(div);
                    }
        }
    }
}
