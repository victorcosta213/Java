package aplication;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        Department name = new Department(sc.next());
        Worker w1 = new Worker();
        sc.nextLine();
        System.out.print("Name: ");
        w1.setName(sc.nextLine());
        System.out.print("Level: "+ WorkerLevel.MID_LEVEL);
        System.out.print("Base salary: ");
        w1.setBaseSalary(sc.nextDouble());
        System.out.print("How many contracts to this worker? ");
        int op = sc.nextInt();

            for (int i = 0; i<op;i++){
                System.out.println("Enter contract #"+(i+1)+"data:");
                System.out.print("Date (DD/MM/YYYY): ");
                Date contractDate;
                    try{
                        contractDate = sdf.parse(sc.next());
                    }catch (ParseException e){
                        System.out.println("Invalid format.");
                    }
                System.out.print("Value per hours: ");
                double valuePerHours = sc.nextDouble();
                System.out.print("Duration (hours): ");
                int hours = sc.nextInt();

                HourContract c1 = new HourContract();



            }







    }
}