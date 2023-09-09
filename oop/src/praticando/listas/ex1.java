package praticando.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios voce deseja cadastrar: ");
        int n = sc.nextInt();
        System.out.println();
        List<Integer> id = new ArrayList<>();
        List<String> nome = new ArrayList<>();
        List<Double> salario = new ArrayList<>();
        funcionarios A = new funcionarios();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1));
            System.out.print("ID: ");
            A.setId(sc.nextInt());
            System.out.print("Nome: ");
            sc.nextLine();
            A.setNome(sc.nextLine());
            System.out.print("salario: ");
            A.setSalario(sc.nextDouble());
            id.add(i, A.getId());
            nome.add(i, A.getNome());
            salario.add(i, A.getSalario());
            System.out.println();
        }

        System.out.print("Digite o ID do funcionario: ");
        int B = sc.nextInt();
        int ref = id.indexOf(B);
        if (ref == -1) {
                        System.out.println("ID não existe");
                        System.out.println();
                        System.out.println("Lista de funcionarios:");
                        for (int i = 0; i < n; i++) {
                            System.out.printf(id.get(i) + ", " + nome.get(i) + ", %.2f%n", salario.get(i));
                        }
            }

               else {
                        System.out.print("Digite a porcentagem do aumento: ");
                        A.setSalario(salario.get(ref));
                        salario.add(ref, A.incremento(sc.nextDouble()));
                        System.out.println();
                        System.out.println("Lista de funcionarios:");
                        for (int i = 0; i < n; i++) {
                            System.out.printf(id.get(i) + ", " + nome.get(i) + ", %.2f%n", salario.get(i));
                        }
                    }
    }
}
