package com.t3h.Bai7;

public class Main {
    public static void main(String[] args) {
        QLHocSinh qlHocSinh = new QLHocSinh();
        qlHocSinh.addHoSo(new HSHocSinh("214325432","Nguyen Van Huan",20,
                1998,"Hai Duong","58TH4","2017-2018","2"));
        qlHocSinh.addHoSo(new HSHocSinh("217325432","Nguyen Van A",20,
                1996,"Thai Nguyen","58TH1","2017-2018","1"));
        qlHocSinh.addHoSo(new HSHocSinh("214325452","Nguyen Anh Tu",20,
                1998,"Quang Ninh","58TH4","2017-2018","1"));
        qlHocSinh.addHoSo(new HSHocSinh("214525432","Vu Ba Ngoc Minh",20,
                1998,"Ha Noi","58TH1","2017-2018","2"));

        System.out.println("==========hien thi toan bo sinh vien===========");
        qlHocSinh.printAllHocSinh();
        System.out.println("\n\n=========hien thi sinh vien sinh nam 1996========");
        qlHocSinh.printHocSinhTheoNamSinh(1998);
        System.out.println("\n\n====sinh vien 98 que hai duong");
        qlHocSinh.printHocSinhTheoNamVSQue(1998,"Hai Duong");
    }
}
