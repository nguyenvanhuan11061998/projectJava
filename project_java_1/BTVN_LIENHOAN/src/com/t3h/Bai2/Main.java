package com.t3h.Bai2;

public class Main {
    public static void main(String[] args) {
        QlCanBo canBo = new QlCanBo();
        canBo.addCanBo(new NhanVien("01","Nguyen Van Huan",1998,true,
                "Hai Duong","Di Hoc"));
        canBo.addCanBo(new CongNhan("02","Nguyen Tuan Dat",1998,true,
                "Ba Vi","giam Doc"));
        canBo.addCanBo(new KySu("03","Hoang Ngoc Hoa",1996,true,
                "Nam Dinh","Nganh xay dung"));

        System.out.println("=============hienThi=============");
        canBo.printAll();
        System.out.println("===========Tim can bo =============");
        canBo.searchCanBo("02");
    }
}
