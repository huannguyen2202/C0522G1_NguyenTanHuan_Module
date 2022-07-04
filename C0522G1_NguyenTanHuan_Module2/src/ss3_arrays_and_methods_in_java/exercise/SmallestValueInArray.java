package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vao n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao a[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min= arr[0];
        for (int i = 0; i<arr.length; i++ ){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min+" là số nhỏ nhất! ");

    }
}
