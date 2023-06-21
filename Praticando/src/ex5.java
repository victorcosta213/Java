import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int popula=0;
        double rendam=0;
        double filhom=0;
        double porc=0;
        double mred= Integer.MIN_VALUE;


        for (double i=1;i>0;){
        System.out.println("Quantas pessoas mora na sua casa:");
        int mora= scanner.nextInt();
        popula+= mora;
        System.out.println("Quantos filhos tem na sua casa:");
        int filho= scanner.nextInt();
        filhom+=filho;
        System.out.println("Qual a renda bruta da sua casa:");
        double renda =scanner.nextDouble();

                    if(renda>mred){
                        mred=renda;
                    }
                    if ((renda/mora)<200){
                        porc+=mora;
                    }
                    rendam+=renda;
                    i=renda;
        }

        double media=rendam/popula;
        double mediaf= filhom/popula;
        double m200= (porc/popula)*100;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("A população é de "+popula+" pessoas");
        System.out.println("A renda media é de "+media+" por pessoa");
        System.out.println("A media de filhos é de "+mediaf+" por pessoa");
        System.out.println("porcentagem da população com renda menor que R$200 é de "+m200+"%");
        System.out.println("O maior salário dos habitante é "+"R$"+mred);
        System.out.println("-------------------------------------------------------------------");
    }
}

