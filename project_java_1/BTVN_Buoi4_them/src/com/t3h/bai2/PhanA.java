package com.t3h.bai2;

public class PhanA {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PhanA(int n) {
        setN(n);
    }

    public double tinhToanA(){
        double S = 1;
        for (int i = 2; i <= getN(); i++) {
            S = S+ (1/(double)(2*i));
        }
        return S;
    }

    public void ketQuaA(){
        System.out.println("ket qua: "+tinhToanA());
    }

    public double tinhToanB(){
        double S = 0;
        double X = 1;
        for (int i = 1; i <= getN(); i++) {
            S = S + i*X;
            X = i*X;
        }
        return S;
    }

    public void ketQuaB(){
        System.out.println("ket qua phan b: "+tinhToanB());
    }

    public double tinhToanC(){
        double S = 0;
        for (int i = 1; i < getN(); i++) {
            S = S + (double)1/((double)(i*(i+1)));
        }
        return S;
    }

    public void ketQuaC(){
        System.out.println("ket qua C la: "+tinhToanC());
    }
}
