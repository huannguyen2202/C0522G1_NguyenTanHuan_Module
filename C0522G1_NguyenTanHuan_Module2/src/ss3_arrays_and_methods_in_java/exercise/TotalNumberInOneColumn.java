package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class TotalNumberInOneColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {5, 9, 7, 3},
                {8, 7, 6, 4}};
        System.out.print("Tính tổng: ");
        int index = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < arr[index].length; i++) {
            sum +=arr[index][i];
        }
        System.out.print("Tổng phần tử cột " + index + " trong mảng hai chiều là: " + sum);
    }
}
