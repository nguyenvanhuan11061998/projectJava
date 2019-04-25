package com.t3h.Bai6;

public class SongMaster {
    public void napBH(){
        System.out.println("nap bai hat");
    }
    public void hienThiBH(){
        System.out.println("hien thi bai hat");
    }
    public void xemThongTinBH(BaiHat song){
        System.out.println("ten bai hat:"+ song.getTenBaiHat());
        System.out.println("the loai: "+song.getTheLoai());
        System.out.println("thoi luong: "+ song.getThoiLuong());
        System.out.println("ten ca si: "+song.getTenCaSi());
        System.out.println("ten album: "+song.getTenAlbum());
        System.out.println("Chat luong: "+song.getChatLuong());
    }
    public void timKiem(){
        System.out.println(" Tim kiem bai hat");
    }
    public void play(){
        System.out.println("play bai hat");
    }
    public void pause(){
        System.out.println("pause bai hat");
    }
    public void stop(){
        System.out.println("stop bai hat");
    }
    public void seek(){
        System.out.println("seek bai hat");
    }
    public void next(){
        System.out.println("next bai hat");
    }
    public void previous(){
        System.out.println("previous bai hat");
    }
    public void delete(){
        System.out.println("delete bai hat");
    }
}
