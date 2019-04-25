package com.t3h.DaHinh;

public class Hoa extends ConNguoi {
    public Hoa(String ten, int tuoi, boolean gioiTinh, String diaChi, String sdt, DongVat dongVat) {
        super(ten, tuoi, gioiTinh, diaChi, sdt, dongVat);
    }

    void datMeoDiShopping(){
        System.out.println(" Hoa dat meo di shopping");
    }
}
