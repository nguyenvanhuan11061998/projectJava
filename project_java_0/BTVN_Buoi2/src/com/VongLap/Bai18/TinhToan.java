package com.VongLap.Bai18;

public class TinhToan {
    int n;
    int demChan =0;
    int demLe = 0;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    void lietKe() {
        double a= 0, b = 1;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                System.out.print(i+"\t");
                if(i % 2 == 0){
                    demChan = demChan+1;
                }else{
                    demLe = demLe+1;
                }
            }
        }
        System.out.println();
        System.out.println("so uoc chan la: "+demChan);
        System.out.println("so uoc le la: "+demLe);
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
