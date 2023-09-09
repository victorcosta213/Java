import java.util.Scanner;

public class ex4_4 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        int n= scanner.nextInt();
        int fat=1;
        for (int i=n;i>0;i--){
            fat= fat*i;
        }
        System.out.println("O fatorial de "+n+" é "+fat);

    }

}
