package com.t3h.Bai3;

import java.util.ArrayList;

public class QLTaiLieu {
    private ArrayList<TaiLieu> listTaiLieu = new ArrayList<>();

    private int check(String maTL){
        for (int i = 0; i < listTaiLieu.size(); i++) {
            if(listTaiLieu.get(i).getMaTL().equals(maTL)){
                return i;
            }
        }return -1;
    }

    public void themTaiLieu(TaiLieu taiLieu){
        int check = check(taiLieu.getMaTL());
        if(check == -1){
            listTaiLieu.add(taiLieu);
        }else{
            System.out.println("tai lieu da ton tai");
        }
    }

    public void timTaiLieu(String maTL){
        int check = check(maTL);
        if (check == -1){
            System.out.println("khong co tai lieu can tim");
        }else{
            listTaiLieu.get(check).inThongTin();
        }
    }

    public void hienThiAllTL(){
        for (TaiLieu taiLieu: listTaiLieu) {
            System.out.println("----------------------");
            taiLieu.inThongTin();
        }
    }
}
