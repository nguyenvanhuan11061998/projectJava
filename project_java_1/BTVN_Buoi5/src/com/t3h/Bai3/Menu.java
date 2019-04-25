package com.t3h.Bai3;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Province> listProvince = new ArrayList<>();


    private int check(String id){
        for (int i = 0; i < listProvince.size(); i++) {
            if(listProvince.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }

//	Phương thức thêm tỉnh thành gồm 2 tham số mã tỉnh thành, tên tỉnh thành
    public void addProvince(String idPro, String namePro){
        int check1 = check(idPro);
        if(check1 ==-1){
            Province province = new Province(idPro,namePro);
            listProvince.add(province);
        }
    }

//	Phương thức thêm món ăn gồm 2 tham số truyền vào gồm mã tỉnh thành, Tidbit
    public void addTidBit(String idPro, TidBit tidBit){
        for (int i = 0; i < listProvince.size(); i++) {
            if(idPro ==listProvince.get(i).getId()){
                listProvince.get(i).addTidbit(tidBit);
            }
        }
    }

//	Phương thức xóa tỉnh thành gồm 1 tham số mã tỉnh thành
    public void removePro(String id){
        int check = check(id);
        if(check>=0){
            listProvince.remove(check);
            System.out.println("delete province thanh cong");
        }else{
            System.out.println("not found this province! ");
        }
    }

//	Phương thức xóa món ăn gồm 2 tham số truyền vào là mã tỉnh, mã món ăn
    public void removeTidBit(String idPro, String idTidBit){
        for (int i = 0; i < listProvince.size(); i++) {
            if(idPro ==listProvince.get(i).getId()){
                listProvince.get(i).removeTidbit(idTidBit);
                System.out.println(" delete bidtit thanh cong");
            }else{
                System.out.println(" not found this Province! ");
            }
        }
    }

//	Phương thức liệt kê món ăn của tỉnh gồm 1 tham số truyền vào là mã tỉnh
    public void searchTidBit(String idPro){
        int check = check(idPro);
        if(check>=0){
            listProvince.get(check).searchTidBit();
        }else{
            System.out.println("không tìm thấy tỉnh thành phố đó");
        }
    }

//	Phương thức tìm kiếm món ăn của 1 tỉnh gồm 2 tham số truyền vào là mã tỉnh, tên món ăn
    public void litedTidBit(String idPro, String nameTid){
        int check = check(idPro);
        if(check >= 0){
            listProvince.get(check).searchTidBit(nameTid);
        }
    }

}
