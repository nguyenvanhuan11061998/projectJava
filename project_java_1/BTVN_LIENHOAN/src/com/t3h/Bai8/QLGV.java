package com.t3h.Bai8;

import java.util.ArrayList;

public class QLGV {
    private ArrayList<CBGV> listCBGV = new ArrayList<>();

    private int checkMaGV(String maGV){
        for (int i = 0; i < listCBGV.size(); i++) {
            if(listCBGV.get(i).getMaGV().equals(maGV)){
                return i;
            }
        }return -1;
    }

    public void addCBVG(CBGV cbgv){
        int check = checkMaGV(cbgv.getMaGV());
        if(check == -1){
            listCBGV.add(cbgv);
        }else{
            System.out.println("CBGV da ton tai");
        }
    }

    public void printCBGV(String maGV){
        int check = checkMaGV(maGV);
        if(check == -1){
            System.out.println("khong tim thay giao vien");
        }else{
            listCBGV.get(check).inThongTin();
        }
    }

    public void printAllCBGV(){
        for (CBGV GV :listCBGV) {
            System.out.println("---------------------------------");
            GV.inThongTin();
        }
    }


    public void tinhLuongGV(String maGV){
        int check = checkMaGV(maGV);
        if(check == -1){
            System.out.println("khong tim thay giao vien");
        }else{
            CBGV GV = listCBGV.get(check);
            System.out.println(" giao vien "+GV.getHoTen()+" co luong thuc linh la: "+GV.luongThucLinh());
        }
    }

    public void tinhLuongAllGV(){
        for (CBGV cbgv:listCBGV) {
            System.out.println();
            System.out.println(" giao vien "+cbgv.getHoTen()+" co luong thuc linh la: "+cbgv.luongThucLinh());
        }
    }
}
