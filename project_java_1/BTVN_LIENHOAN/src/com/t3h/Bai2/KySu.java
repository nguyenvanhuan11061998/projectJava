package com.t3h.Bai2;

public class KySu extends Nguoi{
    private String nganhDaoTao;

    public KySu(String iD, String hoTen, int namSinh, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(iD, hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nganh dao tao: "+nganhDaoTao);
    }
}
