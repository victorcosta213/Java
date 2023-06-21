import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; // inicializa um valor pequeno
        int menor = Integer.MAX_VALUE; // inicializa um valor grande

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            int n = scanner.nextInt();

            if (n < menor) {
                menor = n;
            }

            if (n > maior) {
                maior = n;
            }


        }
        System.out.println("O maior valor da sequencia é "+maior+ " e o menor é "+menor);
    }
}

