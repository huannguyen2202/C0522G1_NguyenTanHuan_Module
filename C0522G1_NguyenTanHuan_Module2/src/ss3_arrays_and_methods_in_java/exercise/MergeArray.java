package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
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
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhập vao n1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("Nhap vao a[%d]: ", i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        int[] newArr= new int[arr.length+arr1.length];
        for (int i =0; i<arr.length; i++){
            newArr[i]=arr[i];
        }
        for (int j =0; j<arr1.length; j++){
            newArr[arr.length+j]=arr1[j];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
