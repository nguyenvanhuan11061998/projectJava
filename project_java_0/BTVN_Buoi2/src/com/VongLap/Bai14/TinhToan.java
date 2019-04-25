package com.VongLap.Bai14;

public class TinhToan {
    double x,n;

    void nhap(double giaTriX,double giaTriN) {
        x = giaTriX;
        n = giaTriN;
    }

    double tinhToan(){
        double S = x;
        for (int i = 2; i <= n; i++) {
            S = S + Math.pow(x,2*n+1);
        }
        return S;
    }
}
