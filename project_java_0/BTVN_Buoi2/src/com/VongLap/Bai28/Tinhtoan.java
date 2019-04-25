package com.VongLap.Bai28;

public class Tinhtoan {
    int n;

    void  nhap( int giaTriN){
        n = giaTriN;
    }

    void  hienThi(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((j>=(n-1-i))&&(j<=(n-1+i))){
                    System.out.print("  * ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
