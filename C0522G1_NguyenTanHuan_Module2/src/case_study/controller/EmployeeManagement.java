package case_study.controller;

import home_work.service.IStudentService;
import home_work.service.impl.StudentService;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);
//    private IStudentService iStudentService = new StudentService();

    public void menuEmployee() {
        do {
            System.out.println("1. Display list employees \n" +
                    "2. Add new employee \n" +
                    "3. Edit employee \n" +
                    "4. Return main menu\n" );
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
