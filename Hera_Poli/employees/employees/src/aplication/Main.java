package aplication;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<Employee> funcionarios = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int op = sc.nextInt();

        for (int i =0; i<op; i++){
            System.out.println("Employee #"+(i+1)+" data: ");
            System.out.print("Outsourced (y/n)? ");
            String r = sc.next();
            sc.nextLine();
                switch (r){
                    case "y":
                            System.out.print("Nome: ");
                            String name = sc.next();
                            System.out.print("Hours: ");
                            int hours = sc.nextInt();
                            System.out.print("Value per hour: ");
                            double valuePorHour = sc.nextDouble();
                            System.out.print("Additional charge: ");
                            double additionalCharge = sc.nextDouble();
                            Employee f1 = new OutsourcedEmployee(name,hours,valuePorHour,additionalCharge);
                            funcionarios.add(f1);
                            break;
                    case "n":
                        System.out.print("Nome: ");
                        String name2 = sc.nextLine();
                        System.out.print("Hours: ");
                        int hours2 = sc.nextInt();
                        System.out.print("Value per hour: ");
                        double valuePorHour2 = sc.nextDouble();
                        Employee f2 = new Employee(name2,hours2,valuePorHour2);
                        funcionarios.add(f2);
                        break;

                }
        }

        System.out.println();
        for (Employee i: funcionarios) {
            System.out.println(i);
        }

        sc.close();
    }
}