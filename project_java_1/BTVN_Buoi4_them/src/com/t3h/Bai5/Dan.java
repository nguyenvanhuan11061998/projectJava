package com.t3h.Bai5;

public class Dan {
    private String satThuong;
    private  String tocDo;

    public String getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(String satThuong) {
        this.satThuong = satThuong;
    }

    public String getTocDo() {
        return tocDo;
    }

    public void setTocDo(String tocDo) {
        this.tocDo = tocDo;
    }

    public Dan(String satThuong, String tocDo) {
        setSatThuong(satThuong);
        setTocDo(tocDo);
    }

    public void inThongTin(){
        System.out.println("    sat thuong dan: "+getSatThuong());
        System.out.println("    toc do dan: "+getTocDo());
    }

    void danDiChuyen(){
        System.out.println("    dan di chuyen nhanh ");
    }

    void danNo(){
        System.out.println("    dan no manh ");
    }
}
