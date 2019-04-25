package com.t3h.Bai6;

public class Main {
    public static void main(String[] args) {
        BaiHat song1 = new BaiHat("duyen phan","Nhac tru tinh",
                "299 giay","Nhu Quynh","tinh xua","mp4");
        Video video1 = new Video("thang dien","nhac tre","285 giay",
                "maver","full hd");

        SongMaster song = new SongMaster();
        song.xemThongTinBH(song1);
        song.play();
        song.timKiem();
        song.delete();
        song.napBH();
        song.next();
        song.next();
        song.seek();

        System.out.println("\n\n-=====================================\n");

        VideoMaster video = new VideoMaster();
        video.xemThongTin(video1);
        video.play();
        video.hienThi();
        video.deleteVideo();
        video.next();
        video.napVideo();
        video.seek();
        video.stop();
    }
}
