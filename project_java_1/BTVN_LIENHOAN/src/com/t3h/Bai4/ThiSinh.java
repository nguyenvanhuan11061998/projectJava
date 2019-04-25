package com.t3h.Bai4;

public abstract class ThiSinh {
    private String sBD;
    private String hoTen;
    private String diaChi;
    private String uuTien;

    public String getsBD() {
        return sBD;
    }

    public ThiSinh(String sBD, String hoTen, String diaChi, String uuTien) {
        this.sBD = sBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    }

    public void inThongTin(){
        System.out.println("So Bao Danh : "+sBD);
        System.out.println("Ho Ten : "+hoTen);
        System.out.println(" dia Chi: "+diaChi);
        System.out.println("uu tien: "+uuTien);
    }
}
