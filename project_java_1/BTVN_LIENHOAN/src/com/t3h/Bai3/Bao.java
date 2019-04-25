package com.t3h.Bai3;

public class Bao extends TaiLieu{
    private String ngayPH;

    public Bao(String maTL, String tenNXB, String soPhatHanh, String ngayPH) {
        super(maTL, tenNXB, soPhatHanh);
        this.ngayPH = ngayPH;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("ngay phat hanh: "+ngayPH);
    }
}
