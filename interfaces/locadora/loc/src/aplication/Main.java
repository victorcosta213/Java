package aplication;

import entities.Locadora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH:mm)): ");
        String retirada = sc.nextLine();
        Date retiradaDate = null;
        System.out.print("retornoDate (dd/MM/yyyy HH:mm)): ");
        String retorno = sc.nextLine();
        Date retornoDate = null;
        try {
            retiradaDate = sdf.parse(retirada);
            retornoDate = sdf.parse(retorno);
        }catch(ParseException e) {
            System.out.println("Formato da data invalido");
        }
        System.out.print("Entre com o preço por hora: R$");
        double precoHora = sc.nextDouble();
        System.out.print("Entre com o preço por dia: R$");
        double precoDia = sc.nextDouble();


        Locadora l1 = new Locadora(modelo,retiradaDate,retornoDate,precoHora,precoDia);


    }
}