import java.util.Scanner;

public class ex4 {
    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite um número:");
        double n= scanner.nextDouble();
        double resultado= fatora(n);
        System.out.println("O fatorial de "+n+" resulta em: "+resultado);
    }
    static double fatora (double x){
        double f=1;
        for(double i= x;i>0;i--){
            f=f*i;
            }
        return f;

    }
    }

