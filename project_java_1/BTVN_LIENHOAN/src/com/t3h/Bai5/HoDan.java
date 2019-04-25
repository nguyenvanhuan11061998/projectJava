package com.t3h.Bai5;

import java.util.ArrayList;

public class HoDan {
    private int soNguoi;
    private int soNha;
    private ArrayList<ConNguoi> listNguoi = new ArrayList<>();

    public HoDan(int soNguoi, int soNha) {
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }

    public int getSoNha() {
        return soNha;
    }

    public int checkNguoi(String hoTen){
        for (int i = 0; i < listNguoi.size(); i++) {
            if (listNguoi.get(i).getHoTen().equals(hoTen)) {
                return i;
            }
        }
        return -1;
    }

    public void addNguoi(ConNguoi conNguoi){
        int check = checkNguoi(conNguoi.getHoTen());
        if(check == -1){
            listNguoi.add(conNguoi);
        }
        else{
            System.out.println("Nguoi da ton tai");
        }
    }

    public void inThongTin(){
        for (ConNguoi nguoi: listNguoi ) {
            System.out.println("----------------------");
            nguoi.inThongTin();
        }
    }
}
