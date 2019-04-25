package com.t3h.DaHinh;

import java.sql.SQLOutput;

public abstract class ConNguoi {
    String ten;
    int tuoi;
    boolean gioiTinh;
    String diaChi;
    String sdt;
    DongVat dongVat;

    public ConNguoi(String ten, int tuoi, boolean gioiTinh, String diaChi, String sdt, DongVat dongVat) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.dongVat = dongVat;
    }

    void inThongTin(){
        System.out.println("Ho ten: "+ten);
        System.out.println("tuoi: "+ tuoi);
        System.out.println("gioi tinh: "+(gioiTinh?"Nam":"Nu"));
        System.out.println("dia chi: "+diaChi);
        System.out.println("so dien thoai: "+sdt);
        System.out.println(dongVat.toString());
        boolean isCho = dongVat instanceof Cho;
        if(isCho == true){
            Cho cho = (Cho) dongVat;
            cho.sua();
        }else{
            Meo meo = (Meo) dongVat;
            meo.batChuot();
        }
    }
}
