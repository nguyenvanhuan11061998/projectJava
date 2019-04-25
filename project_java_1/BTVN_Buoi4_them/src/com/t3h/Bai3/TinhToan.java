package com.t3h.Bai3;

public class TinhToan {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public TinhToan(int a, int b) {
        setA(a);
        setB(b);
    }

    public int kiemTra(){
        int m = getA();
        int n = getB();
        while(m!=n){
            if(m>n){
                m = m-n;
            }else{
                n = n - m;
            }
        }
        return m;
    }

    void ktUB(){
        int a = kiemTra();
        System.out.println("uoc chung lon nhat cua m va n la: "+a);
        System.out.println("boi chung nho nhat cua m va n la: "+((getA()*getB()))/a);
    }
}
