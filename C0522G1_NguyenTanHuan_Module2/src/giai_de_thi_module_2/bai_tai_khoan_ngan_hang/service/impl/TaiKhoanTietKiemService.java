package giai_de_thi_module_2.bai_tai_khoan_ngan_hang.service.impl;

import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.model.TaiKhoanThanhToan;
import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.service.ITaiKhoanTietKiem;

import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanTietKiem {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/giai_de_thi_module_2/bai_tai_khoan_ngan_hang/data/taikhoantietkiem.csv";
    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void display() {

    }

    @Override
    public void find() {

    }
    public static TaiKhoanThanhToan infoTaiKhoanTietKiem() {
        System.out.print("Nhập vào mã số thanh toán: ");
        int maSo= Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào mã tài khoản thanh toán: ");
        String maTaiKhoan = scanner.nextLine();
        System.out.print("Nhập vào tên chủ tài khoản thanh toán: ");
        String tenChuTaiKhoan = scanner.nextLine();
        System.out.print("Nhập vào ngày tạo tài khoản thanh toán: ");
        String ngayTaoTaiKhoan = scanner.nextLine();
        System.out.print("Nhập vào số thẻ thanh toán: ");
        int soThe = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số tiền trong tài khoản: ");
        double soTienTrongTaiKhoan = Double.parseDouble(scanner.nextLine());
        return new TaiKhoanThanhToan(maSo,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soThe,soTienTrongTaiKhoan);
    }
}
