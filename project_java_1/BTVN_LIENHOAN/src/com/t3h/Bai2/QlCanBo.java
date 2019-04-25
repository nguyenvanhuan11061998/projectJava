package com.t3h.Bai2;

import java.util.ArrayList;

public class QlCanBo {
    private ArrayList<Nguoi> listCanBo = new ArrayList<>();

    private int checkID(String id){
        for (int i = 0; i < listCanBo.size(); i++) {
            if(listCanBo.get(i).getiD().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public void addCanBo(Nguoi canBo){
        int check = checkID(canBo.getiD());
        if(check == -1){
            listCanBo.add(canBo);
        }else{
            System.out.println("can bo da ton tai");
        }
    }

    public void searchCanBo(String id){
        int check = checkID(id);
        if(check == -1){
            System.out.println("khong tim thay can bo");
        }else{
            listCanBo.get(check).inThongTin();
        }
    }

    public void printAll(){
        for (Nguoi canBo:listCanBo) {
            System.out.println("--------------------------");
            canBo.inThongTin();
        }
    }
}
