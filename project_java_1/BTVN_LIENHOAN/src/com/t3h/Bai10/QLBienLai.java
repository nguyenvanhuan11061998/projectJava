package com.t3h.Bai10;

import java.util.ArrayList;

public class QLBienLai {
    private ArrayList<BienLai> listBienLai = new ArrayList<>();

    private int checkMaSo(String maCongTo){
        for (int i = 0; i < listBienLai.size(); i++) {
            if(listBienLai.get(i).getMaCongTo().equals(maCongTo)){
                return i;
            }
        }return -1;
    }

    public void addKhachHang(BienLai KH){
        int check = checkMaSo(KH.getMaCongTo());
        if(check == -1){
            listBienLai.add(KH);
        }else{
            System.out.println(" bien lai da ton tai");
        }
    }

    public void printAllKH(){
        for (BienLai khachHang:listBienLai) {
            System.out.println("----------------------------");
            khachHang.inThongTin();
        }
    }

    public void hienThiTien(){
        for (int i = 0; i < listBienLai.size(); i++) {
            int soDien = listBienLai.get(i).getChiSoMoi()- listBienLai.get(i).getChiSoCu();
            System.out.println("so tien KH "+listBienLai.get(i).getHoTen()+" phai tra la: "+soDien*750);
        }
    }
}
