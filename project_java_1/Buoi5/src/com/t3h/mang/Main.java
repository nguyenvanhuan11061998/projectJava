package com.t3h.mang;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        MangTinh mangTinh = new MangTinh(10);
//        mangTinh.inMang();
//
//        mangTinh.sapXepTang();
//
//        mangTinh.sapXepGiam();


        MangDong mangDong = new MangDong();
        mangDong.add(4);
        mangDong.add(3);
        mangDong.add(23);
        mangDong.add(7);
        mangDong.add(1,5);

        mangDong.inMang();
        mangDong.add(1,57);
        mangDong.add(3,15);
        mangDong.inMang();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(6);
        arr.add(2);
        mangDong.addAll(1,arr);
        mangDong.inMang();

//        mangDong.set(3,1000);
        mangDong.inMang();

        int index = mangDong.indexOff(1000);
        System.out.println();
        System.out.println(index);

        boolean check = mangDong.checkContain(arr);
        System.out.println(check);
    }
}
