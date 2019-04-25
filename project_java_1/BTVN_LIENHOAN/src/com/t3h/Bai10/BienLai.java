package com.t3h.Bai10;

public class BienLai extends KhachHang{
    private String thongTin;
    private int chiSoCu;
    private int chiSoMoi;

    public BienLai(String hoTen, int soNha, String maCongTo, String thongTin, int chiSoCu, int chiSoMoi) {
        super(hoTen, soNha, maCongTo);
        this.thongTin = thongTin;
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("thong tin: "+thongTin);
        System.out.println("chi so moi: "+chiSoMoi);
        System.out.println("chi so cu: "+chiSoCu);
    }
}
