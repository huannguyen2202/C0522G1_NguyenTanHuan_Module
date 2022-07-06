package ss4_class_and_object.exercise.exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double del = quadraticEquation.getDiscriminant();
        System.out.println(del);
        double r1 = quadraticEquation.getRoot1();
        System.out.println(r1);
        double r2 = quadraticEquation.getRoot2();
        System.out.println(r2);
        if (del > 0) {
            System.out.println("Phương trình có 2 nghiệm: " + r1 + "\t" + r2);
        }
        if (del == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + r1);
        }
        if (del < 0) {
            System.out.println("Phương trinh");
        }
    }
}
