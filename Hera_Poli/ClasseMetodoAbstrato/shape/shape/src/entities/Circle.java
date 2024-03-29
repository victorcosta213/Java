package entities;

import entities.enums.Color;

public class Circle extends Shape {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius,2) * Math.PI;
    }
}
