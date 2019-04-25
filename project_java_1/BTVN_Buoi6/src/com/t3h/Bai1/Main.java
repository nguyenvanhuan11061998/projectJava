package com.t3h.Bai1;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString();
        String chuoi = "adda453hre43";
        System.out.println("=================Phan 1================");
        System.out.println("tổng của các kí tự số trong chuỗi là: "+myString.tinhTong1(chuoi));
        System.out.println("\n\n=============Phan 2=============");
        myString.tinhTong2(chuoi);
        System.out.println("\n\n==============Phan 3===================");
        myString.kiemTraDoiXung(chuoi);
    }
}
