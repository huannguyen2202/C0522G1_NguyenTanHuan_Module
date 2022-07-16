package ss10_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        Queue<Character> characterQueue = new LinkedList<>();
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            characterQueue.add(str.charAt(i));
            characterStack.push(str.charAt(i));
        }

        boolean isFalse = false;
        while (characterQueue.isEmpty() && characterStack.isEmpty()) {
            if (characterQueue.poll() != characterStack.pop()) {
                isFalse = true;
                break;
            }
        }
        if (isFalse) {
            System.out.println("Không phải là chuỗi Palindrome");
        } else {
            System.out.println("Là chuỗi Palindrome");
        }
    }
}
