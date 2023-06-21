import java.util.Scanner;

public class extra {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número para base:");
        double n= scanner.nextDouble();
        System.out.println("Escolha um número para a elevação:");
        double n2= scanner.nextDouble();
        double resulta= eleva(n,n2);
        System.out.println("O resultado é:"+resulta);
    }

    static double eleva(double x,double y){
        double res=1;
        for(double i=y;i>=1;i--){
        res= res * x;
        }
        return res;
    }
}
