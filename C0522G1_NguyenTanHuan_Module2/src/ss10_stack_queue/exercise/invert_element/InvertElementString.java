package ss10_stack_queue.exercise.invert_element;

import java.util.Scanner;
import java.util.Stack;

public class InvertElementString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<>();
        System.out.println("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stackChuoi.push(str.charAt(i) + "");
        }
        System.out.println("Chuỗi sau khi đảo ngược: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
    }
}
