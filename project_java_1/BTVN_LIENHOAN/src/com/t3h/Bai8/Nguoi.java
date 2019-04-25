package com.t3h.Bai8;

public abstract class Nguoi {
    private String maGV;
    private String hoTen;
    private int namSinh;
    private String queQuan;

    public Nguoi(String maGV, String hoTen, int namSinh, String queQuan) {
        this.maGV = maGV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void inThongTin(){
        System.out.println("ma GV: "+maGV);
        System.out.println("ho va ten: "+hoTen);
        System.out.println("nam sinh: "+namSinh);
        System.out.println("que quan: "+queQuan);
    }
}
