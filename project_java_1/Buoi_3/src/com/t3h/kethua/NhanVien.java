package com.t3h.kethua;

public class NhanVien extends ConNguoi{

    String maNV;
    int luong;
    String phongBan;
    String chucVu;

    public NhanVien(String ten, int tuoi, String diaChi, boolean gioiTinh, String sdt, String maNV, int luong, String phongBan, String chucVu) {
        super(ten, tuoi, diaChi, gioiTinh, sdt);
        this.maNV = maNV;
        this.luong = luong;
        this.phongBan = phongBan;
        this.chucVu = chucVu;
    }


    public NhanVien(String ten, int tuoi, String diaChi, boolean gioiTinh, String sdt, String maNV) {
        super(ten, tuoi, diaChi, gioiTinh, sdt);
        this.maNV = maNV;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("Ma NV: "+ maNV);
        System.out.println("Phong Ban: "+ phongBan);
        System.out.println("luong : "+ luong);
        System.out.println("Chuc vu: "+chucVu);
    }
}
