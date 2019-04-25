package com.VongLap.Bai4;

public class TinhTong {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhTong(){
        double S = 0;
        for (int i = 1; i < n; i++) {
            S = S + (1/(double)(i*2));
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
