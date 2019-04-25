package com.t3h.file;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
//        fileManager.management();
//        fileManager.readAllFile(new File("C:/"));
//        fileManager.write("Hello world\n ");
//        fileManager.read();

        fileManager.downloadFile("https://vnno-zn-6-tf-mcloud-bf-s7-mv-zmp3.zadn.vn/Si9lRqgMz40/a79bc1a55ae1b3bfeaf0/16d18629886c6132387d/360/Anh-Dang-O-Dau-Day-Anh.mp4?authen=exp=1544522520~acl=/Si9lRqgMz40/*~hmac=f71a38f3ee9c2021b102b01a0069208f","AnhDangODauDayAnh.mp4");
    }
}
