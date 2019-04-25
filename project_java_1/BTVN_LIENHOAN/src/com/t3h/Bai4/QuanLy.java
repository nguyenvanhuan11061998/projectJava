package com.t3h.Bai4;

import java.util.ArrayList;

public  class QuanLy {
    ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
    public int checkExist(String sbd){
        for (int i = 0; i < listThiSinh.size(); i++) {
            if(listThiSinh.get(i).getsBD().equals(sbd)){
                return i;
            }
        }return -1;
    }
    public void nhap(ThiSinh thiSinh){
        int check = checkExist(thiSinh.getsBD());
        if(check >=0){
            System.out.println("sinh vien da ton tai");
        }else{
            listThiSinh.add(thiSinh);
        }
    }
    public void hienThi(){
        for (int i = 0; i < listThiSinh.size(); i++) {
            System.out.println("\n---------------------------");
            listThiSinh.get(i).inThongTin();
        }
    }

    public void search(String sbd){
        int check = checkExist(sbd);
        if(check == -1){
            System.out.println("khong tim thay sinh vien");
        }else{
            listThiSinh.get(check).inThongTin();
        }
    }
}
