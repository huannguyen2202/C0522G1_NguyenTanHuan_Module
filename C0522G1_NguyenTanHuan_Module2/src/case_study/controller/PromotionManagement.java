package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    Scanner scanner = new Scanner(System.in);
//    private IStudentService iStudentService = new StudentService();

    public void menuPromotion() {
        do {
            System.out.println("1. Display list customers use service \n" +
                    "2. Display list customers get voucher \n" +
                    "3. Return main menu.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    return;


            }

        } while (true);
    }

}
