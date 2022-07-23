package home_work_student_2.controller;


import home_work_student_2.service.ITeacherService;
import home_work_student_2.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = (ITeacherService) new TeacherService();

    public void menuTeacher() {
        do {
            System.out.println("1. Thêm vào giảng viên. \n" +
                    "2. Xoá giảng viên \n" +
                    "3. Xem danh sách giảng viên \n" +
                    "4. Quay về munu chính ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    return;
            }

        } while (true);

    }

}
