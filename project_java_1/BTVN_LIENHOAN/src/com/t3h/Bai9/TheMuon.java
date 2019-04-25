package com.t3h.Bai9;

import java.text.SimpleDateFormat;

public class TheMuon extends SinhVien {
    private int soPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;

    public TheMuon(String hoTen, int namSinh, int tuoi, String lop, int soPhieuMuon, String ngayMuon, String hanTra, String soHieuSach) {
        super(hoTen, namSinh, tuoi, lop);
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("so phieu muon: "+soPhieuMuon);
        System.out.println("ngay Muon: "+ngayMuon);
        System.out.println("han tra: "+hanTra);
        System.out.println("so hieu sach: "+soPhieuMuon);
    }
}
