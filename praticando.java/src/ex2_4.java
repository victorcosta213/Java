import java.util.Scanner;

public class ex2_4 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o codigo do produto:");
        double i= scanner.nextByte();
        System.out.println("Digite a quantidade:");
        double quantidade= scanner.nextByte();
        double valor=0;
            if (i==1){
                valor=4;
            }
            if (i==2){
                valor=4.50;
            }
            if (i==3){
                valor=5;
            }
            if (i==4){
                valor=2;
            }
            if (i==5){
                valor=1.50;
            }
            double total= quantidade * valor;
        System.out.println("O total da compra foi: R$"+total);

    }
}
