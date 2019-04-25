package com.t3h.Bai10;

import com.t3h.Bai9.QLMuonSach;

public class Main {
    public static void main(String[] args) {
        QLBienLai qlBienLai = new QLBienLai();
        qlBienLai.addKhachHang(new BienLai("Nguyen Van Huan",23,"43252343",
                "cong to loai 1",32,43));
        qlBienLai.addKhachHang(new BienLai("Nguyen Tuan Dat",13,"43243343",
                "cong to loai 1",32,45));
        qlBienLai.addKhachHang(new BienLai("Nguyen Anh Tu",76,"65252343",
                "cong to loai 1",32,87));
        qlBienLai.addKhachHang(new BienLai("Vu Ba ngoc Minh",65,"45452343",
                "cong to loai 1",12,43));

        System.out.println("======== Thong Tin Khach Hang =========");
        qlBienLai.printAllKH();
        System.out.println("\n\n===== Tinh Tien ==================");
        qlBienLai.hienThiTien();
    }
}
