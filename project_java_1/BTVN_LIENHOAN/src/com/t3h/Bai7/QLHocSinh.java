package com.t3h.Bai7;

import java.util.ArrayList;

public class QLHocSinh {
    private ArrayList<HSHocSinh> listHoSo = new ArrayList<>();
    private int checkHS(String maHS){
        for (int i = 0; i < listHoSo.size(); i++) {
            if(listHoSo.get(i).getMaHS().equals(maHS)){
                return i;
            }
        }return -1;
    }

    public void addHoSo(HSHocSinh hocSinh) {
        int check = checkHS(hocSinh.getMaHS());
        if(check == -1){
            listHoSo.add(hocSinh);
        }else{
            System.out.println("hoc sinh da ton tai");
        }
    }

    public void printAllHocSinh(){
        for (int i = 0; i < listHoSo.size(); i++) {
            System.out.println("----------------------------");
            listHoSo.get(i).intThongTin();
        }
    }

    public void printHocSinhTheoNamSinh(int namSinh){
        for (int i = 0; i < listHoSo.size(); i++) {
            if(listHoSo.get(i).getNamSinh() == namSinh){
                System.out.println("--------------------------");
                listHoSo.get(i).intThongTin();
            }
        }
    }

    public void printHocSinhTheoNamVSQue(int namSinh, String queQuan){
        for (int i = 0; i < listHoSo.size(); i++) {
            if(listHoSo.get(i).getQueQuan().equals(queQuan)&&listHoSo.get(i).getNamSinh() == namSinh){
                System.out.println("----------------------------");
                listHoSo.get(i).intThongTin();
            }
        }
    }

}
