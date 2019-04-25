package com.t3h.Bai2;

public class CongNhan extends Nguoi{
    private String bac;

    public CongNhan(String iD, String hoTen, int namSinh, boolean gioiTinh, String diaChi, String bac) {
        super(iD, hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Bac: "+bac);
    }
}
