package com.t3h.Bai5;

public class Main {
    public static void main(String[] args) {
        Dan dan = new Dan(" 1000 dame ","5000");
        XeTangTa xeTangTa = new XeTangTa("500",dan,"3");
        XeTangDich xeTangDich = new XeTangDich("400",dan,"xe Boc thep");

        System.out.println("Xe tang ta: ");
        xeTangTa.inThongTin();
        xeTangTa.ban();
        xeTangTa.kiemTraTrungDan();
        xeTangTa.baoVeBot();
        System.out.println("\n-====================================");
        System.out.println("xe tang dich ");
        xeTangDich.inThongTin();
        xeTangDich.dichuyen();
        xeTangDich.ban();
        xeTangDich.kiemTraTrungDan();
        xeTangDich.phaHuyBot();
    }
}
