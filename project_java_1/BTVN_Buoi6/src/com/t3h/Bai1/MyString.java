package com.t3h.Bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyString {
    private String value;

    public int tinhTong1(String chuoi) {
        int tong = 0;
        char[] str = chuoi.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] <= '9' && str[i] >= '0') {
                tong = tong + str[i] - 48;
            }
        }
        return tong;
    }
    public String xuLyChuoi(String chuoi){
        char [] A = chuoi.toCharArray();
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 48 || A[i] >57){
                A[i] = ' ';
            }
        }
        String chuoi1 = String.valueOf(A);
        return chuoi1;
    }

    public boolean xuLy(String a){
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)>0){
                return true;
            }
        }return false;
    }

    public void tinhTong2(String chuoi) {
        int tong = 0;
        String chuoiSo = xuLyChuoi(chuoi);
        chuoiSo.trim();
        String[] arr = chuoiSo.split(" ");
        for (String s: arr) {
            String a = String.valueOf(s);
            boolean kiemTra = xuLy(a);
            if(kiemTra == true){
                tong = tong + Integer.parseInt(s);
            }
        }

        System.out.println("tong : "+ tong);
    }


    public void kiemTraDoiXung(String chuoi){
        StringBuilder chuoi2 = new StringBuilder(chuoi);
        chuoi2.reverse();
        String c2 = new String(chuoi2);
        boolean kiemTra = chuoi.equals(c2);
        if(kiemTra == true){
            System.out.println("Chuoi doi xung ");
        }else{
            System.out.println("Chuoi khong doi xung ");
        }
    }

}
