package com.t3h.Bai6;

public class Video {
    private String tenVideo;
    private String theLoai;
    private String thoiLuong;
    private String tenHang;
    private String chatLuong;

    public String getTenVideo() {
        return tenVideo;
    }

    public void setTenVideo(String tenVideo) {
        this.tenVideo = tenVideo;
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

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getChatLuong() {
        return chatLuong;
    }

    public void setChatLuong(String chatLuong) {
        this.chatLuong = chatLuong;
    }

    public Video(String tenVideo, String theLoai, String thoiLuong, String tenHang, String chatLuong) {
        this.tenVideo = tenVideo;
        this.theLoai = theLoai;
        this.thoiLuong = thoiLuong;
        this.tenHang = tenHang;
        this.chatLuong = chatLuong;
    }
}
