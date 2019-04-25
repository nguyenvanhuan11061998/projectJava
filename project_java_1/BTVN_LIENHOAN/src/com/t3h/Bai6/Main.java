package com.t3h.Bai6;

import com.t3h.Bai5.KhuPho;

public class Main {
    public static void main(String[] args) {
        KhachSan khachSan = new KhachSan();
        khachSan.addPhongTro(new PhongTro("12","phong vip","3",4000000));
        khachSan.addPhongTro(new PhongTro("4","phong thuong","3",2000000));
        khachSan.addPhongTro(new PhongTro("3","Phong thuong","4",1000000));

        khachSan.themNguoi("12",new Nguoi("Nguyen Van Huan",20,1998,"1243432432094"));
        khachSan.themNguoi("4",new Nguoi("Nguyen Tuan Dat",20,1998,"3243243243432"));
        khachSan.themNguoi("3",new Nguoi("Hoang Ngoc Hoa",20,1996,"432234424432"));

        System.out.println("==========Thong tin nguoi phong 12 ==========");
        khachSan.hienThi("12");
        System.out.println("===========Thong tin Nguoi==============");
        khachSan.hienThiNguoi("3","Hoang Ngoc Hoa");

    }
}
