import java.util.Scanner;

public class ex4_2 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n= scanner.nextInt();

        for (int i=0;i<=n;i++){
            System.out.println("Primeira nota:");
            double n1= scanner.nextDouble();
            System.out.println("Segunda nota:");
            double n2= scanner.nextDouble();
            System.out.println("Terceira nota:");
            double n3= scanner.nextDouble();
            double media= (n1*2 + n2*3 + n3*5)/10;
            System.out.print("A média é:");
            System.out.printf("%.1f%n", media);
        }
    }
}
