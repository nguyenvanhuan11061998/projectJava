package com.t3h.Bai7;

import java.util.ArrayList;

public class HSHocSinh extends Nguoi{
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public HSHocSinh(String maHS, String hoTen, int tuoi, int namSinh, String queQuan, String lop, String khoaHoc, String kyHoc) {
        super(maHS, hoTen, tuoi, namSinh, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public void intThongTin() {
        super.intThongTin();
        System.out.println("lop: "+lop);
        System.out.println("khoa Hoc: "+khoaHoc);
        System.out.println("ky hoc: "+kyHoc);
    }
}
