package com.t3h.Bai3;

public class Sach extends  TaiLieu {
    private String tenTG;
    private int soTrang;

    public Sach(String maTL, String tenNXB, String soPhatHanh, String tenTG, int soTrang) {
        super(maTL, tenNXB, soPhatHanh);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Ten tac gia: "+tenTG);
        System.out.println("so Trang "+soTrang);
    }
}
