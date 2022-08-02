package bai_lam_them.bai_tai_khoan_ngan_hang.controller;

import java.util.Scanner;

public class TaiKhoanTietKiemController {
    Scanner scanner = new Scanner(System.in);
    public void menuTaiKhoanThanhTietKiem() {
        do {
            System.out.println("QUẢN LÝ TÀI KHOẢN TIẾT KIỆM\n" +
                    "1. Thêm mới \n" +
                    "2. Xoá  \n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm \n" +
                    "5. Thoát \n");
            int choose = Integer.parseInt(scanner.nextLine());
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
                    break;
                case 7:
                    return;
            }

        } while (true);
    }
}
