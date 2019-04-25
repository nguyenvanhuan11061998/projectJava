package com.t3h.Bai3;

public class Main {
    public static void main(String[] args) {
        QLTaiLieu qlTaiLieu = new QLTaiLieu();
        qlTaiLieu.themTaiLieu(new Sach("01", "Tien Phong", "23", "Nguyen Tuan Dat", 105));
        qlTaiLieu.themTaiLieu(new TapChi("02", "Tien Phong", "32", "43"));
        qlTaiLieu.themTaiLieu(new Bao("03", "Tien Phong", "43", "23/01/2018"));
        qlTaiLieu.themTaiLieu(new Sach("04", "Tien Phong", "54", "Nguyen Van Huan", 324));

        System.out.println("=============Hien Thi Tai Lieu=========");
        qlTaiLieu.hienThiAllTL();
        System.out.println("=============tim tai lieu===============");
        qlTaiLieu.timTaiLieu("01");
    }
}
