package com.t3h.kethua;

public class SinhVien extends ConNguoi {
    String maSV;
    String lop;
    float diem;


    SinhVien(String maSV, String lop, float diem, String ten, int tuoi, String diaChi, boolean gioiTinh, String sdt) {
        super(ten, tuoi, diaChi, gioiTinh, sdt);
        this.maSV = maSV;
        this.lop = lop;
        this.diem = diem;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Ma sinh vien : " + maSV);
        System.out.println("Lop: " + lop);
        System.out.println("Diem: " + diem);
    }
}
