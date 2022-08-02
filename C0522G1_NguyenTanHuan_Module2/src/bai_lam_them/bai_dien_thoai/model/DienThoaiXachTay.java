package bai_lam_them.bai_dien_thoai.model;

public class DienThoaiXachTay extends DienThoai {
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(int maSo, String tenDienThoai,
                            int giaDienThoai, int soLuong,
                            String nhaSanXuat, String quocGiaXachTay,
                            String trangThai) {
        super(maSo, tenDienThoai, giaDienThoai, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Quốc gia xách tay: "+ getQuocGiaXachTay()+
                ", Trạng thái: "+ getTrangThai();
    }
}
