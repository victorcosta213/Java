import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            File sc = new File("/home/victor/learning/java/Atv_Robson/src/dados_Funcionarios.txt");
            Scanner lendo = new Scanner(sc);
            while (lendo.hasNextLine()){
                String data = lendo.nextLine();
                System.out.println(data.replace("-"," "));
            }
            lendo.close();
        } catch (FileNotFoundException e){
            System.out.println("Error!");
            e.printStackTrace();
        }
    }
}