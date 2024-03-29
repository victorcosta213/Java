package aplication;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shape = new ArrayList<>();

        System.out.print("Enter the number of shape? ");
        int op = sc.nextInt();
        for (int i=1; i<=op;i++){
            System.out.println("Shape #"+(i)+" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            String o = sc.next();
            //char o = sc.next().charAt(0);
            switch (o){
                case "r":
                    System.out.print("Color (BLACK/BLUE/RED): ");
                    Color color = Color.valueOf(sc.next());
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();
                    shape.add(new Rectangle(color,width,height));
                    break;
                case "c":
                    System.out.print("Color (BLACK/BLUE/RED): ");
                    Color color1 = Color.valueOf(sc.next());
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();
                    shape.add(new Circle(color1,radius));
                    break;
                default:
                    System.out.println("Opção indisponivel!");
                    break;
            }
        }

        System.out.println();
        System.out.println("SHAPE AREA: ");
        for (Shape i: shape) {
            System.out.printf("%.2f \n",i.area());
        }
    }
}