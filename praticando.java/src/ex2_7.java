import java.util.Scanner;

public class ex2_7 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite seu sálario:");
        double sal= scanner.nextDouble();

                if (sal>=0 && sal<=2000){
                    System.out.println("Insento de imposto!");
                        }
                if (sal>=2000.01 && sal<=3000) {
                    double imposto= (sal-2000)*0.08;
                    System.out.printf("R$ %.2f%n", imposto);
                        }
                if (sal>=3000.01 && sal<=4500) {
                    double imposto= (1000*0.08)+ ((sal-3000)*0.18);
                    System.out.println("imposto: R$"+imposto);
                }
                if (sal>4500) {
                    double imposto= (1000*0.08)+ ((4500-3000)*0.18)+((sal-4500)*0.28);
                    System.out.println("imposto: R$"+imposto);
                }
    }
    }

