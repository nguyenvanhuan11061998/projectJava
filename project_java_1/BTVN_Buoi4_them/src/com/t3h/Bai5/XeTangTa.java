package com.t3h.Bai5;

public class XeTangTa extends XeTang{
    private String soMang;

    public String getSoMang() {
        return soMang;
    }

    public void setSoMang(String soMang) {
        this.soMang = soMang;
    }

    public XeTangTa(String tocDo, Dan dan, String soMang) {
        super(tocDo, dan);
        setSoMang(soMang);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("    so mang : "+getSoMang());
    }

    @Override
    void dichuyen() {
        System.out.println("    xe tang ta di chuyen nhanh ");
    }

    @Override
    void ban() {
        System.out.println("    ban xe tang dich ");
    }

    public void kiemTraTrungDan(){
        System.out.println("    ban trung ");
    }

    public void baoVeBot(){
        System.out.println("    bao ve bot");
    }
}
