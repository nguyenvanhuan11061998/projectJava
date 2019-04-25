package com.VongLap.Bai3;

public class TinhTong {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhTong(){
        double S = 0;
        for (int i = 1; i < n; i++) {
            S = S + (double)1/i;
        }
        return S;
    }

    void kiemTra(){
        if(n < 7){
            System.out.println("khong thoa man dieu kien n>= 7");
        }else{
            System.out.println("Tong can tinh la: "+ tinhTong());
        }
    }
}
