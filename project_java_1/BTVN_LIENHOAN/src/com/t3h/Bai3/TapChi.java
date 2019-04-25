package com.t3h.Bai3;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private int thangPH;

    public TapChi(String maTL, String tenNXB, String soPhatHanh, String soPhatHanh1) {
        super(maTL, tenNXB, soPhatHanh);
        this.soPhatHanh = soPhatHanh1;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("so Phat hanh: "+soPhatHanh);
        System.out.println("thang phat hanh: "+thangPH);
    }
}
