package com.t3h.Bai2;

public class Main {
    public static void main(String[] args) {
        BaiHat baihat = new BaiHat("Duyen phan",
                "Nhu Quynh","5 mp","5 phut");

        AmNhac amnhac = new AmNhac("Thang dien","Phuong Ly",
                "6mp","6 phut","Nguoi dien");

        baihat.hienThi();
        amnhac.hienThi();

        ChoiNhac choinhac = new ChoiNhac();
        choinhac.play();;
        choinhac.next();
        choinhac.pause();
        choinhac.replay();
    }
}
