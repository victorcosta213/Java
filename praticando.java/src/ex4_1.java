import java.util.Scanner;

public class ex4_1 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int in=0;
        int out=0;
        System.out.println("Digite um número:");
        int n= scanner.nextInt();
        for (int i=0; i<=n;i++){
            System.out.println("Digite um número");
            int p = scanner.nextInt();
            if (p>=10 && p<=20){
                in=in+1;
            } else {
                out=out+1;
            }
        }

        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
