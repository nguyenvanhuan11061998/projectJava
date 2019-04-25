package Bai2_QLChiTieu;

public abstract class QuanLy {
    int stt;
    String thoiGian;
    String diaDiem;

    public QuanLy(int stt,String thoiGian, String diaDiem) {
        this.stt = stt;
        this.thoiGian = thoiGian;
        this.diaDiem = diaDiem;
    }


    void inThongTin(){
        System.out.println("stt: "+stt);
        System.out.println("thoi gian: "+thoiGian);
        System.out.println("dia Diem: "+diaDiem);
    };
}
