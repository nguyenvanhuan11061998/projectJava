package com.VongLap.Bai19;

public class TinhToan {
    int n;
    boolean kiemTra = false;

    void nhap(int giaTriN){
        n = giaTriN;
    }

    boolean kiemTra(int n){
        if(n<=1){
            return kiemTra = false;
        }else if(n == 2 || n == 3){
                return true;
        }else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i == 0){
                    return kiemTra = false;
                }
            }
        }
        return kiemTra = true;
    }

    void kiemTraN(){
        boolean check = kiemTra(n);
        if(check == true){
            System.out.println("so vua nhap la so nguyen to");
        }else{
            System.out.println("so vua nhap khong phai la so nguyen to");
        }
    }
}
