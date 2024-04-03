package aplication;

import module.entities.Account;
import module.exception.LimitException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            sc.nextLine();
            System.out.print("initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("WithDraw: ");
            double withDrawnLimit = sc.nextDouble();
            Account c1 = new Account(number,holder,balance,withDrawnLimit);
            System.out.println();
            System.out.print("Enter amount for withDrawn: ");
            c1.withDrawn(sc.nextDouble());
            System.out.println("New balance: R$"+c1.getBalance());
        }catch (LimitException e){
            System.out.println("Error: "+e.getMessage());
        }


    }
}