package com.t3h.kethua;

public class ConNguoi{
    String ten;
    int tuoi;
    String diaChi;
    boolean gioiTinh;
    String sdt;

    ConNguoi(String ten, int tuoi, String diaChi, boolean gioiTinh, String sdt){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    void inThongTin(){
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Dia chi: "+diaChi);
        String gt = gioiTinh == true? "Nam" : "Nu";
        System.out.println("Gioi Tinh: "+gt);
        System.out.println("So dien thoai: "+sdt);
    }
}
