package com.VongLap.Bai11;

public class TinhToan {
    double n;

    void nhap(double giaTriN) {
        n = giaTriN;
    }

    double tinhToan(){
        double S = 0;
        double X = 1;
        for (int i = 1; i <= n; i++) {
            S = S + i*X;
            X = i*X;
        }
        return S;
    }
}
