package com.VongLap.bai32;

public class TinhToan {
    String A[][] = new String[3][5];

    void nhap(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = "*";
            }

        }
    }

    void xuat(){
        nhap();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
