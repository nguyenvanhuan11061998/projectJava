package com.t3h.Bai5;

import com.t3h.Bai4.KhoiA;

public class Main {
    public static void main(String[] args) {
        KhuPho khuPho = new KhuPho();
        khuPho.addHoDan(2,23);
        khuPho.addHoDan(1,32);

        khuPho.addNguoi(23,new ConNguoi("Nguyen Van Huan",20,"1998","Sinh Vien"));
        khuPho.addNguoi(23,new ConNguoi("Nguyen Tuan Dat",20,"1998","Sinh Vien"));

        khuPho.addNguoi(32,new ConNguoi("Hoang Ngoc Hoa", 21,"1998","Sinh Vien"));

        System.out.println("==========nguoi nha so 23==========");
        khuPho.hienThi(23);
        System.out.println("\n\n============Nguoi nha so 32===========");
        khuPho.hienThi(32);
    }
}
