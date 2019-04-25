package com.t3h.Bai6;

import java.util.ArrayList;

public class KhachSan {
    private ArrayList<PhongTro> listPhong = new ArrayList<>();
    private int check(String soPhong){
        for (int i = 0; i < listPhong.size(); i++) {
            if(listPhong.get(i).getSoPhong().equals(soPhong)){
                return i;
            }
        }return -1;
    }

    public void addPhongTro(PhongTro phongTro){
        int check = check(phongTro.getSoPhong());
        if(check < 0){
            listPhong.add(phongTro);
        }
        else{
            System.out.println("phong da ton tai");
        }
    }

    public void themNguoi(String soPhong,Nguoi nguoi){
        int check = check(soPhong);
        if(check == -1){
            System.out.println("phong khong ton tai");
        }else{
            listPhong.get(check).addNguoi(nguoi);
        }
    }

    public void hienThi(String soPhong){
        int check = check(soPhong);
        if(check == -1){
            System.out.println("phong khong ton tai");
        }else{
            listPhong.get(check).inThongTin();
        }
    }

    public void hienThiNguoi(String soPhong, String HoTen){
        int check = check(soPhong);
        if(check == -1){
            System.out.println("khong co phong nao nhu vay");
        }else{
            listPhong.get(check).inThongTin();
        }
    }
}
