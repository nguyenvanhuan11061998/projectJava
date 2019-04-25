package com.t3h.DaHinh;

public class Thanh extends ConNguoi {
    public Thanh(String ten, int tuoi, boolean gioiTinh, String diaChi, String sdt, DongVat dongVat) {
        super(ten, tuoi, gioiTinh, diaChi, sdt, dongVat);
    }

    void datChoDiDao(){
        System.out.println("Thanh dat cho di dao");
    }
}
