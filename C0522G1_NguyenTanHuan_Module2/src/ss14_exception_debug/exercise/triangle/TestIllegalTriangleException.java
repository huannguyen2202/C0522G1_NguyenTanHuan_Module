package ss14_exception_debug.exercise.triangle;

import java.util.Scanner;

public class TestIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào cạnh thứ nhất của tam giác!");
            double a = scanner.nextDouble();
            System.out.println("Nhập vào cạnh thứ hai của tam giác!");
            double b = scanner.nextDouble();
            System.out.println("Nhập vào cạnh thứ ba của tam giác!");
            double c = scanner.nextDouble();
            try {
                testTriangle(a, b, c);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
//                e.printStackTrace();
            }
        }
    }

    public static void testTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0 || a + b < c || b + c < a || c + a < b) {
            throw new IllegalTriangleException("Lỗi ba cạnh của một tam giác!");
        }
    }
}
