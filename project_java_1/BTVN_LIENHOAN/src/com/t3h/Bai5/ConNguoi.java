package com.t3h.Bai5;

public  class ConNguoi {
    private String hoTen;
    private int tuoi;
    private String namSinh;
    private String ngheNghiep;

    public ConNguoi(String hoTen, int tuoi, String namSinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void inThongTin(){
        System.out.println("Ho Ten: "+hoTen);
        System.out.println("nam sinh: "+namSinh);
        System.out.println("tuoi: "+tuoi);
        System.out.println("nghe nghiep: "+ngheNghiep);
    }
}
