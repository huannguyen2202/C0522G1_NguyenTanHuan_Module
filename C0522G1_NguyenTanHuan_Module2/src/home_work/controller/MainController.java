package home_work.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController() {
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chương trình quản lí sinh viên. \n" +
                    "1. Quản lí học sinh.\n" +
                    "2. Quản lí giảng viên \n " +
                    "3. Thoát chương trình");
            System.out.println("Nhập vào lựa chọn của ban! ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    studentController.menuStudent();
                    break;
                }
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3: {
                    System.exit(1);
                }

            }

        } while (true);

    }


}
