package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
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
        int index;
        System.out.println("Nhập vào số cần chèn:");
        int number = scanner.nextInt();
        do {
            System.out.println("Nhập vào vị trí cần chèn:");
            index = scanner.nextInt();
        } while (index<0||index>arr.length-1);
        int[] newArr= new int[arr.length+1];
        for (int i = 0; i<index; i++){
            newArr[i]= arr[i];
        }
        newArr[index]=number;
        for (int i = index; i<arr.length; i++){
            newArr[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));

    }
}
