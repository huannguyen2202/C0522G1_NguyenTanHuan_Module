package ss13_sort_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vao n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao a[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("arr ="+ Arrays.toString(arr));
        insertSort(arr);
    }
    public static void insertSort(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println("lấy giá trị "+arr[i]);
            int key = arr[i];
            int j;
            for (j = i-1; j>=0&& arr[j]>key; j--){
                System.out.println("hoán đổi " + arr[j+1] + " với " + arr[j]);
                arr[j+1]= arr[j];
            }
            arr[j+1]=key;
            System.out.println(Arrays.toString(arr));
        }

    }
}
