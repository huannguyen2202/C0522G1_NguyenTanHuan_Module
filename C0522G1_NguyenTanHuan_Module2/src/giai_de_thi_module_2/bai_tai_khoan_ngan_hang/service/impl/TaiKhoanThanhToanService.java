package giai_de_thi_module_2.bai_tai_khoan_ngan_hang.service.impl;
import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.model.TaiKhoanNganHang;
import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.model.TaiKhoanThanhToan;
import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.service.ITaiKhoanThanhToan;
import giai_de_thi_module_2.bai_tai_khoan_ngan_hang.util.ReadWriteTaiKhoanNganHangtUtil;
import java.util.List;
import java.util.Scanner;
public class TaiKhoanThanhToanService implements ITaiKhoanThanhToan {
    private static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/giai_de_thi_module_2/bai_tai_khoan_ngan_hang/data/taikhoanthanhtoan.csv";

    @Override
    public void add() {
        List<TaiKhoanNganHang> TaiKhoanNganHang = ReadWriteTaiKhoanNganHangtUtil.readTaiKhoanNganHangFile(PATH);
        TaiKhoanNganHang.add(infoTaiKhoanThanhToan());
        System.out.println("Thêm mới thành công! ");
        ReadWriteTaiKhoanNganHangtUtil.writeTaiKhoanNganHangFile(PATH, TaiKhoanNganHang);
    }
    @Override
    public void remove() {
        System.out.println("Mời bạn nhập id cần xóa: ");
        int idRemove=0;
        do {
            try {
                List<TaiKhoanNganHang> TaiKhoanNganHang = ReadWriteTaiKhoanNganHangtUtil.readTaiKhoanNganHangFile(PATH);
                idRemove = Integer.parseInt(scanner.nextLine());
                boolean isFlag = false;
                for (TaiKhoanNganHang taiKhoanNganHang :TaiKhoanNganHang) {
                    if (taiKhoanNganHang.getMaSo() == idRemove) {
                        System.out.println(" Bạn có chắc muốn xóa hay không? \n" +
                                "1. Có \n" +
                                "2. Không");
                        int chooseYesNo = Integer.parseInt(scanner.nextLine());
                        if (chooseYesNo == 1) {
                            TaiKhoanNganHang.remove(taiKhoanNganHang);
                            System.out.println("Xóa thành công!.");
                            ReadWriteTaiKhoanNganHangtUtil.writeTaiKhoanNganHangFile(PATH,TaiKhoanNganHang);
                        }
                        isFlag = true;
                        break;

                    }
                }
                if (!isFlag) {
                    System.out.println("Không tìm thấy");
                }
                return;

            } catch (NumberFormatException e){
                System.out.println("Bạn có chắc mình nhập đúng ID");
            }

        }while (true);

    }

    @Override
    public void display() {
        List<TaiKhoanNganHang> TaiKhoanNganHang = ReadWriteTaiKhoanNganHangtUtil.readTaiKhoanNganHangFile(PATH);
        for (TaiKhoanNganHang taiKhoanNganHang : TaiKhoanNganHang) {
            System.out.println(taiKhoanNganHang);
        }
    }
    @Override
    public void find() {
        List<TaiKhoanNganHang> TaiKhoanNganHang = ReadWriteTaiKhoanNganHangtUtil.readTaiKhoanNganHangFile(PATH);
        System.out.println("Mời bạn nhập mã tài khoản hoặc tên chủ tài khoản cần tìm kiếm: ");
        String find = scanner.nextLine();
        boolean isExist = false;

        for (TaiKhoanNganHang taiKhoanNganHang : TaiKhoanNganHang) {
            if (taiKhoanNganHang.getMaTaiKhoan().contains(find) || taiKhoanNganHang.getTenChuTaiKhoan().contains(find)) {
                System.out.println(taiKhoanNganHang);
                isExist = true;
            }
        }

        if (!isExist) {
            System.out.println("Không tìm thấy!");
        }
    }
        public static TaiKhoanThanhToan infoTaiKhoanThanhToan() {
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
