package com.t3h.Bai2;

public abstract class Nguoi {
    private String iD;
    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;
    private String diaChi;

    public Nguoi(String iD, String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        this.iD = iD;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getiD() {
        return iD;
    }

    public void inThongTin() {
        System.out.println("id: " + iD);
        System.out.println("ho ten: " + hoTen);
        System.out.println("nam Sinh: "+namSinh);
        System.out.println("gioi Tinh"+(gioiTinh?("Nam"):("Nu")));
    }
}
