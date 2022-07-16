package ss10_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();
        Stack<Integer> numberStack = new Stack<>();
        while (number>0){
            numberStack.push(number%2);
            number/=2;
            }
        while (!numberStack.isEmpty()){
            System.out.print(numberStack.pop());
        }
    }
}
