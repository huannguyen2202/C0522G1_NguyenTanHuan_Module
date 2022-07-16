package ss10_stack_queue.exercise.invert_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertElementArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vao n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào a[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("arr= " + Arrays.toString(arr));
        Stack<Integer> arrStack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            arrStack.push(arr[i]);

        }
        System.out.println("Mảng sau khi đảo ngược: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrStack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }

}
