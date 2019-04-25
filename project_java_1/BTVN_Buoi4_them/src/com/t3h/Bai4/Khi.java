package com.t3h.Bai4;

public class Khi extends DongVat{
    private String thucAn;

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }

    public Khi(String ten, String canNang, String thucAn) {
        super(ten, canNang);
        setThucAn(thucAn);
    }

    @Override
    void intThongTin() {
        super.intThongTin();
        System.out.print(" thuc an yeu thich: "+getThucAn());
    }
}
