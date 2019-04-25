package com.VongLap.Bai33;

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
                if(i==0 || i == 2){
                    System.out.print(" * ");
                }else{
                    if(j==0||j==4){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }
}
