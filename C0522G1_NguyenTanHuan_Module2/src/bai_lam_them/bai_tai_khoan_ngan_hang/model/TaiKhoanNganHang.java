package bai_lam_them.bai_tai_khoan_ngan_hang.model;

public abstract class TaiKhoanNganHang {
    private int maSo;
    private String maTaiKhoan;
    private String tenChuTaiKhoan;
    private String ngayTaoTaiKhoan;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(int maSo, String maTaiKhoan,
                            String tenChuTaiKhoan,
                            String ngayTaoTaiKhoan) {
        this.maSo = maSo;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }
 public abstract String getInfo();
    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return "Mã số: "+ getMaSo()+
                ", Mã tài khoản: "+ getMaTaiKhoan()+
                ", Tên chủ tài khoản: "+ getTenChuTaiKhoan()+
                ", Ngày tạo tài khoản: "+ getNgayTaoTaiKhoan();

    }
}
