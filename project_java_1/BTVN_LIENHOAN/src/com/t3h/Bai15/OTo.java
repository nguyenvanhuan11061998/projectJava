package com.t3h.Bai15;

public class OTo extends PhuongTien{
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo(String hangSX, String namSX, int giaBan, String mau, int soChoNgoi, String kieuDongCo) {
        super(hangSX, namSX, giaBan, mau);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("so cho ngoi: "+soChoNgoi);
        System.out.println("kieu dong co: "+kieuDongCo);
    }
}
