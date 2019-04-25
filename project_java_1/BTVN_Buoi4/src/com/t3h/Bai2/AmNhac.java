package com.t3h.Bai2;

public class AmNhac {
    private String tenBai;
    private String caSi;
    private String dungLuong;
    private String thoiGian;
    private String album;

    public AmNhac(String tenBai, String caSi, String dungLuong, String thoiGian, String album) {
        this.tenBai = tenBai;
        this.caSi = caSi;
        this.dungLuong = dungLuong;
        this.thoiGian = thoiGian;
        this.album = album;
    }

    public String getTenBai() {
        return tenBai;
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

    public String getAlbum() {
        return album;
    }

    public void setTenBai(String tenBai) {
        this.tenBai = tenBai;
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

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "AmNhac{" +
                "tenBai='" + tenBai + '\'' +
                ", caSi='" + caSi + '\'' +
                ", dungLuong='" + dungLuong + '\'' +
                ", thoiGian='" + thoiGian + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
    void hienThi(){
        System.out.println(toString());
    }
}
