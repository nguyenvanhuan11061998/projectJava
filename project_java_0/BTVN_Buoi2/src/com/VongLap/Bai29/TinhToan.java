package com.VongLap.Bai29;

public class TinhToan {
    int n;

    void  nhap( int giaTriN){
        n = giaTriN;
    }

    void  hienThi(){for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if((j>=(n-1-i))&&(j<=(n-1+i))){
                if(i!=0)
                System.out.print("  * ");
            }else System.out.print("  ");
        }
        System.out.println();
    }
    }
}
