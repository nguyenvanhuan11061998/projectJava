package com.th3.Bai1;

public class TinhTong {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    int tinhTong(){
        int S = 0;
        for (int i = 0; i <= n; i++) {
            S = S+i;
        }
        return S;
    }

    void kiemTra(){
        if(n<=3||n>=50){
            System.out.println("khong thoa man dieu kien n >3 va n < 50");
        }else{
            System.out.println("Tong can tinh la: "+ tinhTong());
        }
    }
}
