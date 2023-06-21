import java.util.Scanner;

public class Ex1 {
    public static void main(String[] main) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Quantos alunos existem na sala:");
        int aluno= scanner.nextInt();

        for (int i=0; i<=aluno; i++){
            System.out.println("Nome do aluno:");
            String nome =scanner.next();
            System.out.println("Digite a primeira nota:");
            double nota1= scanner.nextDouble();
            System.out.println("Digite a segunda nota:");
            double nota2= scanner.nextDouble();
            System.out.println("Digite a terceira nota:");
            double nota3= scanner.nextDouble();
            double r = media(nota1,nota2,nota3);
            System.out.println("O aluno "+nome+" ficou com média: "+ r);


        }


    }
     static double media(double x, double y, double z){
         double media = (x+y+z)/3;
         double resultado= media;
         return resultado;

     }

}
