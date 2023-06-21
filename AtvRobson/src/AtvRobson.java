import java.util.Scanner;

public class AtvRobson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        while (i>0){
        System.out.println("Escolha uma opção para achar o volume [1-cubo/2-paralelepipedo]:");
        double op = scanner.nextInt();
        if (op == 1) {
            System.out.println("Digite o lado do cubo:");
            double lc = scanner.nextDouble();
            double vc = cub(lc);
            System.out.println("O volume do cubo é "+vc);
            System.out.println("Deseja calcular de novo? [0-não/1-sim]");
            i= scanner.nextInt();
        }
        if (op == 2) {
            System.out.println("Digite o lado do paralelepipedo:");
            double lp = scanner.nextDouble();
            double vp = pap(lp);
            System.out.println("O volume do paralelepipedo é "+vp);
            System.out.println("Deseja calcular de novo? [0-não/1-sim]");
            i= scanner.nextInt();
        }}
    }
        static double cub (double x){
            double volc= x*x*x;
            return (volc);

        }

        static double pap ( double x){
            double volp= x*x*x;
            return (volp);

        }


    }




