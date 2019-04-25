package com.t3h.Bai2;

public class BaiHat {
    private String tenBaiHat;
    private String caSi;
    private String dungLuong;
    private String thoiGian;

    public BaiHat(String tenBaiHat, String caSi, String dungLuong, String thoiGian) {
        this.tenBaiHat = tenBaiHat;
        this.caSi = caSi;
        this.dungLuong = dungLuong;
        this.thoiGian = thoiGian;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public String getCaSi() {
        return caSi;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "BaiHat{" +
                "tenBaiHat='" + tenBaiHat + '\'' +
                ", caSi='" + caSi + '\'' +
                ", dungLuong='" + dungLuong + '\'' +
                ", thoiGian='" + thoiGian + '\'' +
                '}';
    }

    void hienThi(){
        System.out.println(toString());
    }
}
