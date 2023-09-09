package praticando.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        triangulo x,y;
        x= new triangulo();
        y= new triangulo();
        System.out.println("Digite os lados do triângulo X:");
        x.a= scanner.nextDouble();
        x.b= scanner.nextDouble();
        x.c= scanner.nextDouble();

        System.out.println("Digite os lados do triângulo y:");
        y.a= scanner.nextDouble();
        y.b= scanner.nextDouble();
        y.c= scanner.nextDouble();

        double Areax= x.area();
        double Areay= y.area();

        if (Areax > Areay){
            System.out.printf("%.4f%n", Areax);
            System.out.printf("%.4f%n", Areay);
            System.out.println("O triangulo x é maior que o triangulo y");
        } else {
            System.out.printf("%.4f%n", Areax);
            System.out.printf("%.4f%n", Areay);
            System.out.println("O triangulo y é maior que o triangulo x");

        }


    }


}
