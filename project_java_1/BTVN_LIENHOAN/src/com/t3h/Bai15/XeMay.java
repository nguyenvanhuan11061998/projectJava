package com.t3h.Bai15;

public class XeMay extends PhuongTien{
    private String congSuat;

    public XeMay(String hangSX, String namSX, int giaBan, String mau, String congSuat) {
        super(hangSX, namSX, giaBan, mau);
        this.congSuat = congSuat;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("cong suat: "+congSuat);
    }
}
