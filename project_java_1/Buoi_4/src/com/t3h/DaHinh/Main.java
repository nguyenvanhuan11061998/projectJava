package com.t3h.DaHinh;

public class Main {
    public static void main(String[] args) {
        Cho cho = new Cho("cho Muc",
                10,
                20,
                "Mau den");
        Meo meo = new Meo("Meo muop",
                2,
                3,
                "Mau xam");

        Thanh thanh = new Thanh("Thanh",
                30,
                true,
                "Ha Noi",
                "72398572574",
                cho);

        thanh.inThongTin();
        thanh.datChoDiDao();

        System.out.println("\n\n=================\n\n");

        Hoa hoa = new Hoa("Hoa",
                27,
                false,
                "Ha Noi",
                "0124343787",
                meo);
        hoa.inThongTin();
        hoa.datMeoDiShopping();
    }
}
