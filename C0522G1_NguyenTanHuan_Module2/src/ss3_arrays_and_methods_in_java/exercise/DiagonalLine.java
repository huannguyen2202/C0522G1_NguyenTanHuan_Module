package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalLine {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("nhập vào số hàng bằng số cột");
        int row = sr.nextInt();
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("nhập vào phần tử arr[%d][%d]", i, j);
                arr[i][j] = sr.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(Arrays.toString(arr[i]));
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("Tổng đường chéo chính của ma trận là: " + sum);
    }
}
