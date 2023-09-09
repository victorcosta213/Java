import java.util.Scanner;

public class ex2_2 {
    public static void main(String[]args){
       Scanner sc= new Scanner(System.in);

       int A= sc.nextInt();
       int B= sc.nextInt();

       if (A%B==0||B%A==0){
           System.out.println("São multiplos");
       } else{
           System.out.println("Não são multiplos");
       }

       sc.close();










        /* exemplo
        Scanner numeros= new Scanner(System.in);
        int n;
        int n2;
        System.out.println("Digite um número:");
        n=numeros.nextInt();
        System.out.println("Digite um número:");
        n2=numeros.nextInt();
                if (n>n2){
                    double r= n%n2;
                            if(r==0){
                                System.out.println("Eles são multiplos");
                            } else {
                                System.out.println("Não são multiplos");
                            }
                } else {
                    double r= n2%n;
                            if(r==0){
                                System.out.println("Eles são multiplos");
                            } else {
                                System.out.println("Não são multiplos");
                            }
                }
            */
    }
}
