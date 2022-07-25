package case_study.controller;

import home_work.controller.StudentController;
import home_work.controller.TeacherController;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
//        StudentController studentController = new StudentController();
//        TeacherController teacherController = new TeacherController();
        EmployeeManagement employeeManagement =new EmployeeManagement();
        CustomerManagement customerManagement=new CustomerManagement();
        FacilityManagement facilityManagement=new FacilityManagement();
        BookingManagerment bookingManagerment=new BookingManagerment();
        PromotionManagement promotionManagement=new PromotionManagement();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chương trình quản lí sinh viên. \n" +
                    "1. Employee Management.\n" +
                    "2. Customer Management \n " +
                    "3. Facility Management  \n " +
                    "4. Booking Management  \n " +
                    "5. Promotion Management  \n " +
                    "6. Exit");
            System.out.println("Nhập vào lựa chọn của ban! ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeManagement.menuEmployee();
                    break;
                case 2:
                    customerManagement.menuCustomer();
                    break;
                case 3:
                    facilityManagement.menuFacility();
                    break;
                case 4:
                    bookingManagerment.menuBooking();
                    break;
                case 5:
                    promotionManagement.menuPromotion();
                    break;
                case 6:
                    System.exit(1);

            }

        } while (true);

    }
}
