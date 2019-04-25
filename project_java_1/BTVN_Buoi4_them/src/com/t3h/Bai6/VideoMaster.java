package com.t3h.Bai6;

public class VideoMaster {
    public void napVideo(){
        System.out.println("nap video");
    }
    public void hienThi(){
        System.out.println("hien thi video");
    }
    public void sapXep(){
        System.out.println("sap xep chu de");
    }
    public void xemThongTin(Video video){
        System.out.println("ten video: "+video.getTenVideo());
        System.out.println("the loai : "+video.getTheLoai());
        System.out.println("thoi luong: "+video.getThoiLuong());
        System.out.println("ten hang san xuat: "+video.getTenHang());
        System.out.println("that luong: "+ video.getChatLuong());
    }
    public void timKiem(){
        System.out.println("tim kiem video");
    }
    public void play(){
        System.out.println("play bai video");
    }
    public void pause(){
        System.out.println("pause bai video");
    }
    public void stop(){
        System.out.println("stop bai video");
    }
    public void seek(){
        System.out.println("seek bai video");
    }
    public void next(){
        System.out.println("next bai video");
    }
    public void previous(){
        System.out.println("previous bai video");
    }
    public void deleteVideo() {
        System.out.println("delete bai video");
    }
}

