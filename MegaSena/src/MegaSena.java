import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Random generate= new Random();

        int i=0;
        while (i<15){
            int number= generate.nextInt(25);
            System.out.println(number);
            i++;
        }

        }
    }
