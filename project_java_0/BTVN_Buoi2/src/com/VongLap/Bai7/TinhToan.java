package com.VongLap.Bai7;

public class TinhToan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhToan(){
        double S = 0;
        for (int i = 1; i < n; i++) {
            S = S + (double)(i/(double)(i+1));
        }
        return S;
    }

    void kiemTra(){
        if(n < 1){
            System.out.println("khong thoa man dieu kien n");
        }else{
            System.out.println("Tong can tinh la: "+ tinhToan());
        }
    }
}
