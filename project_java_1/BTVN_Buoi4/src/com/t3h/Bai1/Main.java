package com.t3h.Bai1;

public class Main {
    public static void main(String[] args) {
        MauDo maudo = new MauDo("mau do");
        HinhChuNhat hcn = new HinhChuNhat("Hinh chu nhat",maudo);

        MauXanh mauxanh = new MauXanh("mau xanh");
        HinhTamGiac htg = new HinhTamGiac("Hinh tam giac",mauxanh);

        hcn.ve();
        htg.ve();
    }
}
