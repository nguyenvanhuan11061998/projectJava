package com.t3h.Bai4;

public class Main {
    public static void main(String[] args) {
        QuanLy SinhVien= new QuanLy();
        SinhVien.nhap(new KhoiA("1234","Nguyen Van Huan","Hai Duong","Hang1",
                "3","4","3"));
        SinhVien.nhap(new KhoiB("4324","Nguyen Tuan Dat","Ba Vi","hang 2","3",
                "5","5"));
        SinhVien.nhap(new KhoiC("43242","Nguyen Anh Tu","Quang Ninh","Hang 4","5",
                "4","5"));
        SinhVien.hienThi();

        System.out.println("\n-----------Tim kiem----------");
        SinhVien.search("1234");
    }
}
