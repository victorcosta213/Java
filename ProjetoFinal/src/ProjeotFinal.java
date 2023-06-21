// Aluno: Victor costa medeiros
import java.util.Scanner;

public class ProjeotFinal {

    static double media(double x, double y, double z, double w) {
        double res = (x + y * 2 + z * 3 + w) / 7;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 7;
        double id = 0;
        double m1 = 0;
        double m2 = 0;
        double m3 = 0;
        double me = 0;
        double res = 0;
        int alunoa = 0;
        int alunob = 0;
        int alunoc = 0;
        int alunod = 0;
        int alunoe = 0;

        for (int i = 0; i <= 19; i++) {
            System.out.println("Digite o identificador:");
            id = scanner.nextInt();
            System.out.println("Digite a media 1:");
            m1 = scanner.nextDouble();
            System.out.println("Digite a media 2:");
            m2 = scanner.nextDouble();
            System.out.println("Digite a media 3:");
            m3 = scanner.nextDouble();
            System.out.println("Digite a media ME:");
            me = scanner.nextDouble();
            res = media(m1, m2, m3, me);
                            if (res <= 10 && res >= 9) {
                                alunoa += 1;
                            }
                            if (res <= 9 && res >= 7.5) {
                                alunob += 1;
                            }
                            if (res <= 7.5 && res >= 6) {
                                alunoc += 1;
                            }
                            if (res <= 6 && res >= 4) {
                                alunod += 1;
                            }
                            if (res <= 4) {
                                alunoe += 1;
                            }
        }


        while (op > 0) {
            System.out.println("1-Cadastrar novas notas");
            System.out.println("2-Alunos que tiveram aproveitamento A e B");
            System.out.println("3-Alunos que tiveram aproveitamento C e D");
            System.out.println("4-Alunos que tiveram aproveitamento abaixo de D");
            System.out.println("5-Alunos que tiveram aproveitamento acima de B");
            System.out.println("0-Sair do programa");
            op = scanner.nextInt();

                    if (op==1){
                        for (int i = 0; i <= 19; i++) {
                             alunoa = 0;
                             alunob = 0;
                             alunoc = 0;
                             alunod = 0;
                             alunoe = 0;
                            System.out.println("Digite o identificador:");
                            id = scanner.nextInt();
                            System.out.println("Digite a media 1:");
                            m1 = scanner.nextDouble();
                            System.out.println("Digite a media 2:");
                            m2 = scanner.nextDouble();
                            System.out.println("Digite a media 3:");
                            m3 = scanner.nextDouble();
                            System.out.println("Digite a media ME:");
                            me = scanner.nextDouble();
                            res = media(m1, m2, m3, me);
                            if (res <= 10 && res >= 9) {
                                alunoa += 1;
                            }
                            if (res <= 9 && res >= 7.5) {
                                alunob += 1;
                            }
                            if (res <= 7.5 && res >= 6) {
                                alunoc += 1;
                            }
                            if (res <= 6 && res >= 4) {
                                alunod += 1;
                            }
                            if (res <= 4 && res>=0) {
                                alunoe += 1;
                            }
                        }

                    }

                    if (op == 2) {
                        System.out.println(alunoa + " tiveram aproveitamento A");
                        System.out.println(alunob + " tiveram aproveitamento B");
                    }
                    if (op == 3) {
                        System.out.println(alunoc + " tiveram aproveitamento C");
                        System.out.println(alunod + " tiveram aproveitamento D");
                    }
                    if (op == 4) {
                        System.out.println(alunoe + " tiveram aproveitamento abaixo de D");

                    }
                    if (op == 5) {
                        System.out.println(alunoa + " Acima de B");

                    }
        }

    }
}










