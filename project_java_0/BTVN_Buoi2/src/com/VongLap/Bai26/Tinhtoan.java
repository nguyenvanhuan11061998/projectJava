package com.VongLap.Bai26;

public class Tinhtoan {
    int n;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    void lietKe(){
        if(n<=0){
            System.out.println(" so n phai la so nguyen duong");
        }else{
            System.out.println("day so le nho hon n la: ");
            for (int i = 0; i <= n; i++) {
                if(i%2 != 0){
                    System.out.print(i+"\t");
                }
            }
        }
    }
}
