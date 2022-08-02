package bai_lam_them.bai_dien_thoai.model;

public class DienThoaiChinhHang extends DienThoai {
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(int maSo, String tenDienThoai,
                              int giaDienThoai, int soLuong,
                              String nhaSanXuat, String thoiGianBaoHanh,
                              String phamViBaoHanh) {
        super(maSo, tenDienThoai, giaDienThoai, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }
//    public String getInfo(){
//        return String.format("%s,%s,%s,%s,%s,%s,%s\n",
//                   this.getMaSo(),
//                this.getTenDienThoai(),
//                this.getSoLuong(),
//                this.,
//                this.getiDNumber(),
//                this.getPhoneNumber(),
//             this.getEmail();
//    }

    @Override
    public String toString() {
        return super.toString()+
                ", Thời gian bảo hành: " +getThoiGianBaoHanh()+
                ", Phạm vi bảo hành: " +getPhamViBaoHanh();
    }
}
