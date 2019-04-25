package com.t3h.Bai5;

public abstract class XeTang {
    protected String tocDo;
    Dan dan;

    public XeTang(String tocDo, Dan dan) {
        this.tocDo = tocDo;
        this.dan = dan;
    }

    public void inThongTin(){
        System.out.println("    toc do xe tang: "+tocDo);
        System.out.println("    thong so dan: ");
        dan.inThongTin();
        dan.danDiChuyen();
        dan.danNo();
    }

    abstract void dichuyen();
    abstract void ban();
}
