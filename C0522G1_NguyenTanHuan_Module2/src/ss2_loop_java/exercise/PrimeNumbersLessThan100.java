package ss2_loop_java.exercise;

import java.util.Scanner;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        for (int prime = 2; prime <= 100; prime++) {
            int count = 0;
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(prime + "\t");
            }
        }
    }
    }
