package praticando;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex8 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        List<String> nome= new ArrayList<>();
        System.out.print("Quantos nomes você deseja digitar: ");
        int n= sc.nextInt();

        for (int i=0; i<n; i++){
            nome.add(i,sc.nextLine());
        }





    }
}
