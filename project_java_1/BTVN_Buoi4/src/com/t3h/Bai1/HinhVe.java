package com.t3h.Bai1;

public abstract class HinhVe {
    String hinh;
    ButVe butve;

    public HinhVe(String hinh, ButVe butve) {
        this.hinh = hinh;
        this.butve = butve;
    }

    void ve(){
        boolean isbut = butve instanceof MauDo;
        if(isbut == true){
            MauDo maudo = (MauDo) butve;
            System.out.print(hinh);
            maudo.ve();
        }else{
            MauXanh mauXanh = (MauXanh) butve;
            System.out.print(hinh);
            mauXanh.ve();
        }
    }
}
