package giai_de_thi_module_2.bai_dien_thoai.model;

public abstract class DienThoai {
    private int maSo;
    private String tenDienThoai;
    private int giaDienThoai;
    private int soLuong;
    private String nhaSanXuat;

    public DienThoai() {
    }

    public DienThoai(int maSo, String tenDienThoai,
                     int giaDienThoai, int soLuong,
                     String nhaSanXuat) {
        this.maSo = maSo;
        this.tenDienThoai = tenDienThoai;
        this.giaDienThoai = giaDienThoai;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public int getGiaDienThoai() {
        return giaDienThoai;
    }

    public void setGiaDienThoai(int giaDienThoai) {
        this.giaDienThoai = giaDienThoai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Mã số: "+ getMaSo()+
                ", Tên điẹn thoại: "+getTenDienThoai()+
                ", Giá điện thoại: "+ getGiaDienThoai()+
                ", Số lượng: "+ getSoLuong()+
                ", Nhà sản xuất: "+ getNhaSanXuat();
    }
}
