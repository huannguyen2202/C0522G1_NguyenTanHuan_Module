package ss2_loop_java.practice;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int number = scanner.nextInt();
        int count = 0, i = 1;
        for (; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " Là số nguyên tố!");
        } else {
            System.out.println(number + " Không phải là số nguyên tố!");
        }
    }
}
