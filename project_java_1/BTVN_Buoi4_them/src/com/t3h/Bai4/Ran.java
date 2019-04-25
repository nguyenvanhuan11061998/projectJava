package com.t3h.Bai4;

public class Ran extends DongVat {
    private String chieuDai;

    public String getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(String chieuDai) {
        this.chieuDai = chieuDai;
    }

    public Ran(String ten, String canNang, String chieuDai) {
        super(ten, canNang);
        setChieuDai(chieuDai);
    }

    @Override
    void intThongTin() {
        super.intThongTin();
        System.out.print(" chieu dai: "+getChieuDai());
    }
}
