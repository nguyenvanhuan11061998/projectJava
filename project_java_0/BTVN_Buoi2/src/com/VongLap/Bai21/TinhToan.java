package com.VongLap.Bai21;

public class TinhToan {
    int m,n;

    void nhap(int giaTriM, int giaTriN){
        m = giaTriM;
        n = giaTriN;
    }

    int kiemTra(int m, int n){
        while(m!=n){
            if(m>n){
                m = m-n;
            }else{
                n = n-m;
            }
        }
        return m;
    }

    void ktUB(){
        int a = kiemTra(m,n);
        System.out.println("uoc chung lon nhat cua m va n la: "+a);
        System.out.println("boi chung nho nhat cua m va n la: "+(m*n)/a);
    }
}
