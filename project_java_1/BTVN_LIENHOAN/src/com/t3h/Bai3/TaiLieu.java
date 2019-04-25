package com.t3h.Bai3;

public abstract class TaiLieu {
    private String maTL;
    private String tenNXB;
    private String soPhatHanh;

    public String getMaTL() {
        return maTL;
    }

    public TaiLieu(String maTL, String tenNXB, String soPhatHanh) {
        this.maTL = maTL;
        this.tenNXB = tenNXB;
        this.soPhatHanh = soPhatHanh;
    }

    public void inThongTin(){
        System.out.println("Ma tai lieu: "+maTL);
        System.out.println("Ten nha xuat ban: "+tenNXB);
        System.out.println("so phat hanh: "+soPhatHanh);
    }
}
