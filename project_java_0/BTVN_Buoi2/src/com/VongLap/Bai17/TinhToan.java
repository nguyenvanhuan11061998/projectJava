package com.VongLap.Bai17;

public class TinhToan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    void lietKe() {
        double a= 0, b = 1;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                System.out.print(i+"\t");
                a = a+ i;
                b = b* i;
            }
        }
        System.out.println();
        System.out.println(" tong tat ca cac uoc cua so do la: "+a);
        System.out.println(" tich tat ca cac uoc cua so do la: "+b);
    }

    void kiemTra(){
        if(n<=0){
            System.out.println("n phai la so nguyen duong");
        }else{
            System.out.println("day so uoc can tim la: ");
            lietKe();
        }
    }
}
