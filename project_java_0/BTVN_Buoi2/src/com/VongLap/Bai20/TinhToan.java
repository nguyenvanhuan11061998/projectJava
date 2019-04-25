package com.VongLap.Bai20;

public class TinhToan {
    int n;
    boolean kiemTra = false;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    boolean kiemTra(int n){
        if(n<=0){
            return false;
        }else if(n == 1){
            return true;
        }else if(n == 2){
            return false;
        }else{
            for (int i = 2; i < n; i++) {
                if(Math.pow(i,2) == n){
                    return  true;
                }
            }
        }
        return false;
    }

    void kiemTraN(){
        boolean check = kiemTra(n);
        if(check == true ){
            System.out.println(" n la so chinh phuong");
        }else{
            System.out.println(" n khong la so chinh phuong");
        }
    }
}
