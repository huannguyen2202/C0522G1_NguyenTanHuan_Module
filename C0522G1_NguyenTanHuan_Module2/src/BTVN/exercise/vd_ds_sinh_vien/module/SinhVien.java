package BTVN.exercise.vd_ds_sinh_vien.module;

public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private int namSinh;
    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
