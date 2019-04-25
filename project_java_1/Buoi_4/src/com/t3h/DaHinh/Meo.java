package com.t3h.DaHinh;

public class Meo extends  DongVat{
    public Meo(String ten, int tuoi, float canNang, String mauLong) {
        super(ten, tuoi, canNang, mauLong);
    }

    void batChuot(){
        System.out.println("bat chuot gioi.");
    }
}
