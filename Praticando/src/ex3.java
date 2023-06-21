import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("A tabuada de qual número você:");
        int n= scanner.nextInt();

        for(int i=0; i<=10;i++){
            System.out.println(n+" x "+i+"= "+(i*n));
        }

    }
}
