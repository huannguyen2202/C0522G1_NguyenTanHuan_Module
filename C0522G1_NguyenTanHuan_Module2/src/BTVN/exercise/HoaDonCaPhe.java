package BTVN.exercise;

public class HoaDonCaPhe {
    public static void main(String[] args) {
        HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen",100,1.5);
        System.out.println("Tong tien: "+hd.tinhTongTien());


    }

    private final double giaTien1Kg;
    private final double khoiLuong;
    public HoaDonCaPhe(String ten, double gia, double kl){
        this.giaTien1Kg=gia;
        this.khoiLuong=kl;
    }
    public double tinhTongTien(){
        return this.khoiLuong*this.giaTien1Kg;
    }
}
