package com.VongLap.Bai31;

public class TinhToan {
    int n = 4;
    String A[][] = new String[n][n];


    void nhapMang(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = "*";
            }

        }
    }

    void veHinh(){
        nhapMang(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<=i){
                    if((i!=1)&&(i!=2)&&(i!=n)){

                    }
                    System.out.print(A[i][j]+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
