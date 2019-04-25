package com.t3h.Bai4;

public class Main {
    public static void main(String[] args) {
        Ran ran = new Ran("ho mang","3kg","5m");
        SuTu suTu = new SuTu("Leo","100kg","thit huou");
        Khi khi = new Khi("dot","60kg","hoa qua");

        ran.intThongTin();
        System.out.println("\n-=========================");
        suTu.intThongTin();
        System.out.println("\n-==========================");
        khi.intThongTin();
    }
}
