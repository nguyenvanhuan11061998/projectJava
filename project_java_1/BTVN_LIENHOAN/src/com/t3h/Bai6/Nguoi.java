package com.t3h.Bai6;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String cmnd;

    public Nguoi(String hoTen, int tuoi, int namSinh, String cmnd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void inThongTin(){
        System.out.println("ho Ten : "+hoTen);
        System.out.println("tuoi : "+tuoi);
        System.out.println("nam sinh: "+namSinh);
        System.out.println("chung minh nhan dan: "+cmnd);
    }
}
