package com.t3h.Bai6;

public class BaiHat {
    private String tenBaiHat;
    private String theLoai;
    private String thoiLuong;
    private String tenCaSi;
    private String tenAlbum;
    private String chatLuong;

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(String thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getTenAlbum() {
        return tenAlbum;
    }

    public void setTenAlbum(String tenAlbum) {
        this.tenAlbum = tenAlbum;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    public BaiHat(String tenBaiHat, String theLoai, String thoiLuong, String tenCaSi, String tenAlbum, String chatLuong) {
        this.tenBaiHat = tenBaiHat;
        this.theLoai = theLoai;
        this.thoiLuong = thoiLuong;
        this.tenCaSi = tenCaSi;
        this.tenAlbum = tenAlbum;
        this.chatLuong = chatLuong;
    }
}
