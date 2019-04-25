package com.t3h.Bai1;

public class Main {
    public static void main(String[] args) {
        MyAccount myAccount = new MyAccount("12345","Nguyen Van Huan",20,"nguyenvanhuan@gmail.com","nguyenvanhuan");


        FriendManager friend = new FriendManager();
        friend.add(new Friends("12345","Nguyen Van Huan",20,"nguyenvanhuan@gmail.com","khong co gi"));
        friend.add(new Friends("12346","Nguyen Anh Tu",20,"nguyenanhtu@gmail.com","khong co gi"));
        friend.add(new Friends("12347","Vu Ba Ngoc Minh",20,"vubangocminh@gmail.com","khong co gi"));

        MessagerManager messagerManager = new MessagerManager();
        messagerManager.add(new Messager("13232","20/10/2018","khong co gi","tin nhan den","gui thanh cong"));
        messagerManager.add(new Messager("132352","21/10/2018","khong co gi","tin nhan di","gui thanh cong"));
        messagerManager.add(new Messager("132332","14/10/2018","khong co gi","tin nhan den","gui thanh cong"));


        System.out.println("-=============thong tin================");
        friend.printAll();
        System.out.println("-===============sua thong tin===============");
        friend.edit(new Friends("12347","Nguyen Tuan Dat",20,"nguyentuandat@gmail.com","khong co gi"));
        System.out.println("-================tim kiem===============");
        friend.search("12345");
        System.out.println("=================sap xep================");
        friend.soft();
        friend.printAll();

        System.out.println("-================thong tin mess-=========");
        messagerManager.printAll();
        System.out.println("==========them mot mess===================");
        messagerManager.add(new Messager("13235","21/9/2018","khong co gi","tin nhan di","gui thanh cong"));
        System.out.println("=============sua mot mess==================");
        messagerManager.edit(new Messager("132352","21/10/2018","khong co gi","tin nhan di","gui thanh cong"));


    }
}
