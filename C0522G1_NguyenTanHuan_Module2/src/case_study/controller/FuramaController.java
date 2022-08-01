package case_study.controller;

import home_work.controller.StudentController;
import home_work.controller.TeacherController;

import java.io.IOException;
import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() throws IOException {

        EmployeeManagement employeeManagement = new EmployeeManagement();
        CustomerManagement customerManagement = new CustomerManagement();
        FacilityManagement facilityManagement = new FacilityManagement();
        BookingManagerment bookingManagerment = new BookingManagerment();
        PromotionManagement promotionManagement = new PromotionManagement();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ KHU NGHỈ DƯỠNG FURAMA. \n" +
                    "1. Quản lý nhân viên\n" +
                    "2. Quản lý khách hàng \n " +
                    "3. Quản lý cơ sở  \n " +
                    "4. Quản lý đặt chỗ  \n " +
                    "5. Quản lý khuyến mãi  \n " +
                    "6. Thoát");

            int choose = 0;
            try {
                System.out.print("Mời bạn nhập vào lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.print("Vui lòng nhập số: ");
            }

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
                default:
                    System.out.print("Nhập lại lựa chọn: ");

            }

        } while (true);

    }
}
