package case_study.controller;

import java.util.Scanner;

public class FacilityManagement {
    Scanner scanner = new Scanner(System.in);
//    private IStudentService iStudentService = new StudentService();

    public void menuFacility() {
        do {
            System.out.println("1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Display list facility maintenance \n" +
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
