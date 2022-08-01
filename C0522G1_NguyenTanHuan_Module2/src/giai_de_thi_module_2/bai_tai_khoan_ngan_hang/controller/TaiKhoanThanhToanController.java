package giai_de_thi_module_2.bai_tai_khoan_ngan_hang.controller;

import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.service.ITaiKhoanThanhToan;
import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.service.impl.TaiKhoanThanhToanService;

import java.util.Scanner;

public class TaiKhoanThanhToanController {
    Scanner scanner = new Scanner(System.in);
    ITaiKhoanThanhToan iTaiKhoanThanhToan=new TaiKhoanThanhToanService();
    public void menuTaiKhoanThanhToan() {
        do {
            System.out.println("QUẢN LÝ TÀI KHOẢN THANH TOÁN\n" +
                    "1. Thêm mới \n" +
                    "2. Xoá \n" +
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm  \n" +
                    "5. Thoát \n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTaiKhoanThanhToan.add();
                    break;
                case 2:
                    iTaiKhoanThanhToan.remove();
                    break;
                case 3:
                    iTaiKhoanThanhToan.display();
                    break;
                case 4:
                    iTaiKhoanThanhToan.find();
                    break;
                case 5:

                    break;
                case 6:
                    return;
            }

        } while (true);
    }

}
