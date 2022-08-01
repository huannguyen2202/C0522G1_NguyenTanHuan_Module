package giai_de_thi_module_2.bai_tai_khoan_ngan_hang.controller;
import java.util.Scanner;

public class MainController {
    public static void menuController() {
        TaiKhoanThanhToanController taiKhoanThanhToanController = new TaiKhoanThanhToanController();
        TaiKhoanTietKiemController taiKhoanTietKiemController = new TaiKhoanTietKiemController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG. \n" +
                    "1. Quản lý tài khoản thanh toán.\n" +
                    "2. Quản lý tài khoản tiết kiệm \n " +
                    "3. Thoát chương trình");
            System.out.println("Nhập vào lựa chọn của ban! ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    taiKhoanThanhToanController.menuTaiKhoanThanhToan();
                    break;
                case 2:
                    taiKhoanTietKiemController.menuTaiKhoanThanhTietKiem();
                    break;
                case 3:
                    System.exit(1);
            }

        } while (true);

    }
}
