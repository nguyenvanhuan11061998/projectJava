package com.VongLap.Bai5;

public class TinhToan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhToan(){
        double S = 1;
        for (int i = 1; i < n; i++) {
            S = S + (double)1/((double)(i*2+1));
        }
        return S;
    }

    void kiemTra(){
        if(n < 2){
            System.out.println("khong thoa man dieu kien n");
        }else{
            System.out.println("Tong can tinh la: "+ tinhToan());
        }
    }
}
