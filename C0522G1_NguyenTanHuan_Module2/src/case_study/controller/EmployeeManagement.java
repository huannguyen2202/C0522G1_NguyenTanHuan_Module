package case_study.controller;

import case_study.service.IEmployeeService;
import case_study.service.impl.EmployeeService;
import home_work.service.IStudentService;
import home_work.service.impl.StudentService;

import java.util.Scanner;

public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);
    IEmployeeService iEmployeeService=new EmployeeService();

    public void menuEmployee() {
        do {
            System.out.println("QUẢN LÝ NHÂN VIÊN!\n" +
                    "1. Hiển thị danh sách nhân viên \n" +
                    "2. Thêm mới nhân viên \n" +
                    "3. Chỉnh sửa nhân viên \n" +
                    "4. Quay về menu chính.\n");

            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn!");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
            }

            switch (choose) {
                case 1:
                    iEmployeeService.display();

                    break;
                case 2:
                    iEmployeeService.add();

                    break;
                case 3:

                    break;
                case 4:
                    return;
                default:
                    System.out.println("Nhập lại lựa chọn!");

            }

        } while (true);
    }

}
