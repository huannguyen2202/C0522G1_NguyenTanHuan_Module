package ss1IntroductionToJava.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so tien usd: ");
        usd = scanner.nextDouble();
        double exchange = usd * vnd;
        System.out.println("Gia tri VND: " + exchange);
    }
}
