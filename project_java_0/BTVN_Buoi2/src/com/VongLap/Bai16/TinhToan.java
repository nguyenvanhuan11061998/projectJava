package com.VongLap.Bai16;

public class TinhToan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    void lietKe() {
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                System.out.print(i+"\t");
            }
        }
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
