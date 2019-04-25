package com.t3h.Bai4;

public abstract class DongVat {
    protected String ten;
    protected String canNang;

    public DongVat(String ten, String canNang) {
        this.ten = ten;
        this.canNang = canNang;
    }

    void intThongTin(){
        System.out.print(" ten "+ten);
        System.out.print(" can nang "+canNang);
    }
}
