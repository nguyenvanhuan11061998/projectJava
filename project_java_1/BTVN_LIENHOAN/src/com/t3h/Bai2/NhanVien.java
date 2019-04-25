package com.t3h.Bai2;

public class NhanVien extends Nguoi{
    private String congViec;

    public NhanVien(String iD, String hoTen, int namSinh, boolean gioiTinh, String diaChi, String congViec) {
        super(iD, hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Cong viec: "+congViec);
    }
}
