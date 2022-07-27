package case_study.controller;

import case_study.service.IBookingService;
import case_study.service.impl.BookingService;

import java.util.Scanner;

public class BookingManagerment {
    Scanner scanner = new Scanner(System.in);
//    private IStudentService iStudentService = new StudentService();
    IBookingService iBookingService = new BookingService();

    public void menuBooking() {
        do {
            System.out.println("QUẢN LÝ ĐẶT CHỖ: \n"+
                    "1. Thêm mới đặt chỗ \n" +
                    "2. Hiển thị danh sách đặt chỗ \n" +
                    "3. Tạo hợp đồng mới \n" +
                    "4. Hiển thị danh sách hợp đồng\n" +
                    "5. Chỉnh sửa hợp đồng\n" +
                    "6. Quay về menu chính.");
            int choose = 0;
            try {
                System.out.println("Mời bạn nhập lựa chọn!");
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
            }
            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("vui lòng chọn lại!");

            }

        } while (true);
    }
}
