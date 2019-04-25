package com.VongLap.Bai2;

public class TinhTong {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhTong(){
        double S = 0;
        for (int i = 1; i < n; i++) {
            S = S + Math.pow(i,2);
        }
        return S;
    }

    void kiemTra(){
        if(n < 5 || n > 20){
            System.out.println("khong thoa man dieu kien n>= 5 va n <= 20");
        }else{
            System.out.println("Tong can tinh la: "+ tinhTong());
        }
    }
}
