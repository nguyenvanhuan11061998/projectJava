package com.VongLap.Bai12;

public class TinhToan {
    double x,n;

    void nhap(double giaTriX,double giaTriN) {
        x = giaTriX;
        n = giaTriN;
    }

    double tinhToan(){
        double S = x;
        for (int i = 2; i <= n; i++) {
            S = S + Math.pow(x,n);
        }
        return S;
    }
}
