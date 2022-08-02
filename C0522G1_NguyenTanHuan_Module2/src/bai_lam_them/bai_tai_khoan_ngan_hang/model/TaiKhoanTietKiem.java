package bai_lam_them.bai_tai_khoan_ngan_hang.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    private int soTienGuiTietkiem;
    private String ngayGuiTietKiem;
    private Double laiSuat;
    private String kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int maSo, String maTaiKhoan,
                            String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            int soTienGuiTietkiem, String ngayGuiTietKiem,
                            Double laiSuat, String kiHan) {
        super(maSo, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietkiem = soTienGuiTietkiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public int getSoTienGuiTietkiem() {
        return soTienGuiTietkiem;
    }

    public void setSoTienGuiTietkiem(int soTienGuiTietkiem) {
        this.soTienGuiTietkiem = soTienGuiTietkiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public Double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(Double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                this.getMaSo(),
                this.getMaTaiKhoan(),
                this.getTenChuTaiKhoan(),
                this.getNgayTaoTaiKhoan(),
                this.getSoTienGuiTietkiem(),
                this.getNgayGuiTietKiem(),
                this.getLaiSuat(),
                this.getKiHan());
    }
    @Override
    public String toString() {
        return super.toString()+
                ", Số tiền gửi tiết kiệm: "+ getSoTienGuiTietkiem()+
                ", Ngày gửi tiết kiệm: "+ getNgayGuiTietKiem()+
                ", Lãi suất: "+ getLaiSuat()+
                ", Kì hạn: "+ getKiHan();
    }
}
