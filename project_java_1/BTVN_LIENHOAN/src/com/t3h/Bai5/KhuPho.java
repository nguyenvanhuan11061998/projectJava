package com.t3h.Bai5;

import java.util.ArrayList;

public class KhuPho {
    ArrayList<HoDan> listHoDans = new ArrayList<>();

    public int checkSoNha(int soNha){
        for (int i = 0; i < listHoDans.size(); i++) {
            if(listHoDans.get(i).getSoNha() == soNha){
                return i;
            }
        }return -1;
    }

    public void addHoDan(int soNguoi, int soNha){
        int check = checkSoNha(soNha);
        if(check == -1){
            HoDan hoDan = new HoDan(soNguoi,soNha);
            listHoDans.add(hoDan);
        }
    }


    public void hienThi(int soNha){
        int check = checkSoNha(soNha);
        if(check == -1){
            System.out.println("khong co nha nhu vay");
        }else{
            listHoDans.get(check).inThongTin();
        }
    }

    public void addNguoi(int soNha, ConNguoi nguoi){
        int check = checkSoNha(soNha);
        if(check == -1){
            System.out.println("khong co so nha do");
        }else {
            listHoDans.get(check).addNguoi(nguoi);
        }
    }
    public ArrayList<HoDan> nhap(int n){

    }
}
