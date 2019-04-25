package com.VongLap.Bai9;

public class TinhToan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    double tinhToan(){
        double S = 1;
        for (int i = 2; i <= n; i++) {
            S = S*i;
        }
        return S;
    }

    void kiemTra(){
        if(n <6){
            System.out.println("khong thoa man dieu kien n");
        }else{
            System.out.println("Tong can tinh la: "+ tinhToan());
        }
    }
}
