package ss6_inheritance.exercise.circle.controller;

import ss6_inheritance.exercise.circle.model.Circle;
import ss6_inheritance.exercise.circle.model.Cylinder;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "black");

        System.out.println("radius: " + circle.getRadius());
        System.out.println("color: " + circle.getColor());
        System.out.println("area: " + circle.getArea());

        circle.setColor("blue");
        circle.setRadius(4.0);

        System.out.println("radius: " + circle.getRadius());
        System.out.println("color: " + circle.getColor());
        System.out.println("area: " + circle.getArea());
        Cylinder cylinder = new Cylinder(3.0, "black", 4.0);
        System.out.println("height: " + cylinder.getHeight());
        System.out.println("volume: " + cylinder.getVolume());
        cylinder.setHeight(5.0);
        System.out.println("height: "+cylinder.getHeight());
        System.out.println("volume: " + cylinder.getVolume());

    }
}
