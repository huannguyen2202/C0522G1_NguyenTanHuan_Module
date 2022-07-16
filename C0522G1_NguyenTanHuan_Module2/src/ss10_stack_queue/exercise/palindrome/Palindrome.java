package ss10_stack_queue.exercise.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        Queue<Character> strQueue = new LinkedList<>();
        Stack<Character> strStack= new Stack<>();
        for (int i = 0; i<str.length(); i++){
            strQueue.add(str.charAt(i));
            strStack.push(str.charAt(i));
        }
        System.out.println(strQueue);
        System.out.println(strStack);
        for (int i = 0; i<str.length(); i++){
            System.out.print(strStack.pop());
            System.out.print(strQueue.poll());
        }



    }
}
