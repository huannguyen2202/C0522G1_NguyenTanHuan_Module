package case_study.controller;

import java.util.Scanner;

public class PromotionManagement {
    Scanner scanner = new Scanner(System.in);

    public void menuPromotion() {
        do {
            System.out.println("QUẢN LÝ KHUYẾN MÃI!"+
                    "1. Hiẻn thị danh sách khách hàng sử dụng dịch vụ \n" +
                    "2. Hiển thị danh sách khách hàng nhận được voucher \n" +
                    "3. Quay về menu chính!.");

            int choose = 0;
            try {
                System.out.println("Mời bạn nhập vào lưuạ chọn!");
                choose = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số1");
            }

            switch (choose) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    return;
                default:
                    System.out.println("Nhập lại lựa chọn!");
            }

        } while (true);
    }

}
