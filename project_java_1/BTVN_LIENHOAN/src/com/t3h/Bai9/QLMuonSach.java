package com.t3h.Bai9;

import java.util.ArrayList;

public class QLMuonSach {
    private ArrayList<TheMuon> listSV = new ArrayList<>();

    private int checkSoPhieu(int soPhieu){
        for (int i = 0; i < listSV.size(); i++) {
            if(listSV.get(i).getSoPhieuMuon() == soPhieu){
                return i;
            }
        }return -1;
    }

    public void addTheMuon(TheMuon theMuon){
        int check = checkSoPhieu(theMuon.getSoPhieuMuon());
        if(check == -1){
            listSV.add(theMuon);
        }else{
            System.out.println("da co the muon trong list");
        }
    }

    public void printAllSV(){
        for (TheMuon theMuon:listSV) {
            System.out.println("-----------------");
            theMuon.inThongTin();
        }
    }

    public void printSV(int soTheMuon){
        int check = checkSoPhieu(soTheMuon);
        if(check == -1){
            System.out.println("khong tim thay sinh vien");
        }else{
            listSV.get(check).inThongTin();
        }
    }
}
