package com.t3h.Bai9;

public abstract class SinhVien {
    private String hoTen;
    private int namSinh;
    private int tuoi;
    private String lop;

    public SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tuoi = tuoi;
        this.lop = lop;
    }
    public void inThongTin(){
        System.out.println("ho ten: "+hoTen);
        System.out.println("nam Sinh: "+namSinh);
        System.out.println("tuoi : "+tuoi);
        System.out.println("lop : "+lop);
    }
}
