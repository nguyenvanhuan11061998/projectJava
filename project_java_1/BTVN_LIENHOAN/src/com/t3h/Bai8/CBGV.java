package com.t3h.Bai8;

import java.util.ArrayList;

public class CBGV extends Nguoi {
    private int luongCung;
    private int thuong;
    private int phat;

    public CBGV(String maGV, String hoTen, int namSinh, String queQuan, int luongCung, int thuong, int phat) {
        super(maGV, hoTen, namSinh, queQuan);
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public int getThuong() {
        return thuong;
    }

    public int getPhat() {
        return phat;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Luong cung: "+luongCung);
        System.out.println("thuong: "+thuong);
        System.out.println("phat: "+phat);
    }

    public int luongThucLinh(){
        int luongThucLinh = luongCung+thuong-phat;
        return luongThucLinh;
    }
}
