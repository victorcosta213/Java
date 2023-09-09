import java.util.Scanner;

public class ex2_5 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        double n= scanner.nextDouble();


                if (n>=0 && n<25){
                    System.out.println("Esse número está no intervalo de [0,25]");
                }
                else if (n>=25 && n<50){
                    System.out.println("Esse número está no intervalo de [25,50]");
                }
                else if (n>=50 && n<75){
                    System.out.println("Esse número está no intervalo de [50,75]");
                }
                else if (n>=75 && n<=100){
                    System.out.println("Esse número está no intervalo de [75,100]");
                }
                else if (n<0 || n>100){
                    System.out.println("Fora dos intervalos!");
                }

                scanner.close();
    }
}
