package com.t3h.Bai4;

public class KhoiC extends ThiSinh {
    private String diemVan;
    private String diemSu;
    private String diemDia;

    public KhoiC(String sBD, String hoTen, String diaChi, String uuTien, String diemVan, String diemSu, String diemDia) {
        super(sBD, hoTen, diaChi, uuTien);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Diem Van: "+diemVan);
        System.out.println("Diem Su: "+diemSu);
        System.out.println("Diem Dia: "+diemDia);
    }
}
