package ss12_search_algorithm.exercise.use_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class UseRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vao n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào a[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arr= " + Arrays.toString(arr));
        System.out.print("Nhập vào số cần tìm: ");
        int number = scanner.nextInt();
        System.out.println("Vị trí= "+binarySearch(arr,0, arr.length-1, number));
    }
    public static int binarySearch(int[]arr, int left, int right, int x) {
        if (right >= left) {
            int mid = (right + left) / 2;
            if (x == arr[mid]) {
                return mid;
            }
            if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, right, x);
            }
            return binarySearch(arr, left, mid - 1, x);
        }
        return -1;
    }
}
