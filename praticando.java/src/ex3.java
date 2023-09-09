import java.util.Scanner;

public class ex3 {
    public static void main(String[]args){
    Scanner senha= new Scanner(System.in);
    int sc= senha.nextShort();

    while (sc!=2002){
        System.out.println("senha invalida!");
        sc= senha.nextShort();

    }

        System.out.println("Acesso permitido");


    }
}
