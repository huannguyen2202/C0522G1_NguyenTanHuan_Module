package case_study.controller;

import java.util.Scanner;

public class CustomerManagement {
    Scanner scanner = new Scanner(System.in);
//    private IStudentService iStudentService = new StudentService();

    public void menuCustomer() {
        do {
            System.out.println("1. Display list customers \n" +
                    "2. Add new customer \n" +
                    "3. Edit customer \n" +
                    "4. Return main menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    return;

            }

        } while (true);
    }

}
