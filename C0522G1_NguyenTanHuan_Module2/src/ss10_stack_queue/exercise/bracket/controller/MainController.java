package ss10_stack_queue.exercise.bracket.controller;

import java.util.Scanner;

import static ss10_stack_queue.exercise.bracket.model.Bracket.checkBracket;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String string = scanner.nextLine();
        System.out.println(checkBracket(string));
    }

}
