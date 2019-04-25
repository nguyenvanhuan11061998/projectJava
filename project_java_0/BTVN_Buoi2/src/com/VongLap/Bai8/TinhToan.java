package com.VongLap.Bai8;

public class TinhToan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhToan(){
        double S = 0;
        for (int i = 1; i < n; i++) {
            S = S + ((double)(i*2+1)/(double)(2*i+2));
        }
        return S;
    }

    void kiemTra(){
        if(n < 5){
            System.out.println("khong thoa man dieu kien n");
        }else{
            System.out.println("Tong can tinh la: "+ tinhToan());
        }
    }
}
