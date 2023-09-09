package praticando.extra;

import java.util.Scanner;

public class principal {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        double alimentacao=0;
        double moradia=0;
        double saude=0;
        double lazer=0;
        double transporte=0;
        int i=1;
        while (i>0){
                            System.out.println("Grupos:");
                            System.out.println("1- alimentação");
                            System.out.println("2- moradia");
                            System.out.println("3- saude");
                            System.out.println("4- lazer");
                            System.out.println("5- transporte");
                            System.out.println("0- total");
                            System.out.println("Escolha o grupo:");
                            int op= scanner.nextInt();

                                    if (op==1){
                                        System.out.println("Digite o valor:");
                                        double valor= scanner.nextDouble();
                                        alimentacao= alimentacao+valor;
                                    }
                                    if (op==2){
                                        System.out.println("Digite o valor:");
                                        double valor= scanner.nextDouble();
                                        moradia= moradia+valor;
                                    }
                                    if (op==3){
                                        System.out.println("Digite o valor:");
                                        double valor= scanner.nextDouble();
                                        saude= saude+ valor;
                                    }
                                    if (op==4){
                                        System.out.println("Digite o valor:");
                                        double valor= scanner.nextDouble();
                                        lazer= lazer+valor;
                                    }
                                    if (op==5){
                                        System.out.println("Digite o valor:");
                                        double valor= scanner.nextDouble();
                                        transporte= transporte+valor;

                                    }
                                    i=op;
                            }

        double total= alimentacao+moradia+saude+lazer+transporte;

        System.out.println("Total em alimentação:"+alimentacao);
        System.out.println("total em moradia:"+moradia);
        System.out.println("Total em saude:"+saude);
        System.out.println("Total em lazer:"+lazer);
        System.out.println("Total em transporte:"+transporte);
        System.out.println("Gasto total:"+total);


    }

}

