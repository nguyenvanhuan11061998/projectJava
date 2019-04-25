package com.t3h.Bai10;

public abstract class KhachHang {
    private String hoTen;
    private int soNha;
    private String maCongTo;

    public KhachHang(String hoTen, int soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void inThongTin(){
        System.out.println("ho ten chu ho: "+hoTen);
        System.out.println("so nha: "+soNha);
        System.out.println("ma so cong to: "+maCongTo);
    }
}
