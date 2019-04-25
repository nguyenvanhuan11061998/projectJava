package com.VongLap.Bai10;

public class TinhToan {
    double n,m;

    void nhap(double giaTriN, double giaTriM){
        n = giaTriN;
        m = giaTriM;
    }

    double tinhToan(){
        double S = 0;
        S = Math.pow(n,m);
        return S;
    }
}
