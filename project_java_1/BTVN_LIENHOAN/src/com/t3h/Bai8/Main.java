package com.t3h.Bai8;

public class Main {
    public static void main(String[] args) {
        QLGV qlgv = new QLGV();
        qlgv.addCBVG(new CBGV("001","Nguyen Van Huan",1998,"Hai Duong",
                15000000,3000000,1000000));
        qlgv.addCBVG(new CBGV("002","Nguyen Tuan Dat",1998,"Ba Vi",
                15000000,3000000,2000000));
        qlgv.addCBVG(new CBGV("003","Hoang Ngoc Hoa",1996,"Nam Dinh",
                10000000,1000000,5000000));
        qlgv.addCBVG(new CBGV("004","Nguyen Van Son",1995,"Nam Dinh",
                12000000,3000000,3000000));

        System.out.println("======Hien Thi Thong Tin=======");
        qlgv.printAllCBGV();
        System.out.println("\n\n======CBGV Ma 001====================");
        qlgv.printCBGV("001");
        System.out.println("\n\n========Tinh Luong CBGV Ma 002=========");
        qlgv.tinhLuongGV("002");
        System.out.println("\n\n=======Luong Tat Ca CBGV =============");
        qlgv.tinhLuongAllGV();
    }
}
