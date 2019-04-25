package com.t3h.Bai15;

public class XeTai extends PhuongTien {
    private String trongTai;

    public XeTai(String hangSX, String namSX, int giaBan, String mau, String trongTai) {
        super(hangSX, namSX, giaBan, mau);
        this.trongTai = trongTai;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("trong tai: "+trongTai);
    }
}
