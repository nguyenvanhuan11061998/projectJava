package com.t3h.ConNguoi;

public class ConNguoi {
    String ten;
    DongVat dongVat;

    ConNguoi(String Ten) {
        this.ten = Ten;
        dongVat = new DongVat("cho");
    }

    void sayHello() {
        System.out.println(" Xin Chao " + ten);
    }

    class DongVat {
        String ten;

        DongVat(String ten) {
            this.ten = ten;
        }

        void  inTen(){
            System.out.println(" Ten dong vat la: " + ten);
            System.out.println(" Ten con nguoi la: "+ ConNguoi.this.ten);
        }
    }
}
