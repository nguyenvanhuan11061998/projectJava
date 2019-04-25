package com.t3h.Bai2;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register(new User("Nguyễn_Văn_Huân"," nguyenvanhuan",
                " vanhuan"," 11/06/1998"," 20"," Sinh_Viên\n"));
        manager.register(new User("Nguyễn_Tuấn_Đạt"," nguyentuandat",
                " tuandat"," 23/05/1998"," 20"," Sinh_Viên\n"));


        manager.saveAllUser();
        manager.getAllUser();
        manager.showAllUser();
    }
}
