package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();
        System.out.println("Nhập vào kí tự bạn muốn kiểm tra:");
        char character = scanner.nextLine().charAt(0);
        int count =0;
        for (int i =0; i<str.length(); i++){
            if (character==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
