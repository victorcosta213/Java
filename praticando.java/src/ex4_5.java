import java.util.Scanner;

public class ex4_5 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        int n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i+" ");
            }
        }


    }

}
