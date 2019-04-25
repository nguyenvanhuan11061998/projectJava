package com.t3h.Bai15;

public abstract class PhuongTien {
    private String hangSX;
    private String namSX;
    private int giaBan;
    private String mau;

    public PhuongTien(String hangSX, String namSX, int giaBan, String mau) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.mau = mau;
    }

    public void inThongTin(){
        System.out.println("hang san xuat: "+hangSX);
        System.out.println("nam san xuat: "+namSX);
        System.out.println("gia ban: "+giaBan);
        System.out.println("mau: "+mau);
    }
}
