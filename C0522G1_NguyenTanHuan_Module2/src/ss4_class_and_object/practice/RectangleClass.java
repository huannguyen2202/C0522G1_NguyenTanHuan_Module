package ss4_class_and_object.practice;

import java.awt.*;
import java.util.Scanner;

public class RectangleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập vào chiều dài: ");
        double height = scanner.nextDouble();
        RectangleClass rectangleClass = new RectangleClass(width, height);
        double area = rectangleClass.getArea();
        System.out.println(area);
        double perimeter = rectangleClass.getPerimeter();
        System.out.println(perimeter);
        String dislay = rectangleClass.dislay();
        System.out.println(dislay);
    }

    private double width;
    private double height;

    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String dislay() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
