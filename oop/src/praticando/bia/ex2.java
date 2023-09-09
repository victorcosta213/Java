package praticando.bia;

import java.util.Scanner;

public class ex2 {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n= sc.nextInt();
        if (n<1000){
            for (int i=1; i<=n;i++){
                System.out.print("1___"+i+" ");
            }
        } else {
            System.out.println("Fora do intervalo");
        }

    }
}
