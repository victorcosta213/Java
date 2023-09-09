package praticando.ex3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite o comprimento e a altura do retângulo:");
        retangulo R = new retangulo();
        R.comprimento= scanner.nextDouble();
        R.altura= scanner.nextDouble();

        System.out.println(R.toString());
    }
}
