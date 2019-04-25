package com.t3h.kethua;

public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("1233455",
                "LanDT1810",
                10.0f,
                "Nguyen Van Huan",
                12,
                "Ha Noi",
                true,
                "0123445566");

        sv.inThongTin();


        System.out.println("-===========================-");


        NhanVien nv = new NhanVien("Nguyen Van Huan",
                20,
                "Ha Noi",
                true,
                "0124322545",
                "NV001");



        nv.inThongTin();





    }
}
