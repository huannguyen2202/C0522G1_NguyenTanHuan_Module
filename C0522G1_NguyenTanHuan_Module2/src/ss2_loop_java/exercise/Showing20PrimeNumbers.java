package ss2_loop_java.exercise;

import java.util.Scanner;

public class Showing20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lượng số nguyên tố");
        int number = scanner.nextInt();
        int count = 0;
        int prime = 2;
        while (count < number) {
            int divisor = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                System.out.println(prime + "\n");
                count++;
            }
            prime++;
        }
    }
}
