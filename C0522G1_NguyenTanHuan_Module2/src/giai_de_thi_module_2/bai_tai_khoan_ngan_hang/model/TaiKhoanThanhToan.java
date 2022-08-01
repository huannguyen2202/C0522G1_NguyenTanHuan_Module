package giai_de_thi_module_2.bai_tai_khoan_ngan_hang.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private int soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int maSo, String maTaiKhoan,
                             String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                             int soThe, double soTienTrongTaiKhoan) {
        super(maSo, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }
        public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s\n",
                this.getMaSo(),
                this.getMaTaiKhoan(),
                this.getTenChuTaiKhoan(),
                this.getNgayTaoTaiKhoan(),
                this.getSoThe(),
                this.getSoTienTrongTaiKhoan());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Số thẻ: "+ getSoThe()+
                ", Số tiền trong tài khoản: "+ getSoTienTrongTaiKhoan();
    }
}
