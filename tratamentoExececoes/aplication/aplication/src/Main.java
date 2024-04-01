import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method2();
        System.out.println("Fim do programa!");

    }

    public static void method(){
        System.out.println("*********** Method start **********");
        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("posição indefinida!");
            e.printStackTrace();
            sc.next();
        }catch (InputMismatchException e){
            System.out.println("Opção indisponivel!");
        }
        System.out.println("*********** Method end **********");
        sc.close();
    }

    public static void method2(){
        System.out.println("*********** Method2 start **********");
        method();
        System.out.println("*********** Method2 end **********");
    }
}