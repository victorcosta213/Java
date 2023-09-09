import java.util.Scanner;

public class ex3_2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        double x= scanner.nextDouble();
        double y= scanner.nextDouble();
        while (x!=0 || y!=0){

            if (x>0 && y>0){
                System.out.println("primeiro");
                x= scanner.nextDouble();
                y= scanner.nextDouble();
            }
            else  if (x<0 && y>0){
                System.out.println("segundo");
                x= scanner.nextDouble();
                y= scanner.nextDouble();
            }
            else  if (x<0 && y<0){
                System.out.println("terceiro");
                x= scanner.nextDouble();
                y= scanner.nextDouble();
            }
            else  if (x>0 && y<0){
                System.out.println("quarto");
                x= scanner.nextDouble();
                y= scanner.nextDouble();
            }
        }
        scanner.close();
    }
}
