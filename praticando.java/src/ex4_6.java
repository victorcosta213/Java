import java.util.Scanner;

public class ex4_6 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        int n= scanner.nextInt();
        for (int i=1;i<=n;i++){
            int primeiro=i;
            int segunda=i*i;
            int terceiro=i*i*i;

            System.out.printf("%d %d %d%n", primeiro, segunda, terceiro);

        }
        scanner.close();

    }
}
