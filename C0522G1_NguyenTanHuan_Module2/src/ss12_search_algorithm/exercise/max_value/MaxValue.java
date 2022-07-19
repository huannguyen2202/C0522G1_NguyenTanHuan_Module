package ss12_search_algorithm.exercise.max_value;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = scanner. nextLine();
        LinkedList<Character>maxList= new LinkedList<>();
        for (int i = 0; i<str.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j=i+1; j<str.length(); j++){
                if (str.charAt(i)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }
            if (list.size()> maxList.size()){
                maxList.clear();
                maxList.addAll(list);
            }
            list.clear();

        }
        for (Character ch: maxList) {
            System.out.print(ch);
        }
        System.out.println();

    }
}
