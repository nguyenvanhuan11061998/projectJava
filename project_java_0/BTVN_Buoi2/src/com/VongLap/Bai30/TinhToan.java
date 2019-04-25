package com.VongLap.Bai30;

public class TinhToan {
    int n;

    void  nhap( int giaTriN){
        n = giaTriN;
    }

    void veHinh(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
