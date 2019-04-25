package com.t3h.Bai3;

import java.util.ArrayList;

public class Province {
    private String id;
    private String name;
    private ArrayList<TidBit> listTidBit = new ArrayList<>();


    public Province(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int check(String id) {
        for (int i = 0; i < listTidBit.size(); i++) {
            if (id == listTidBit.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    public void addTidbit(TidBit tidBit) {
        int check = check(tidBit.getId());
        if (check == -1) {
            listTidBit.add(tidBit);
        } else {
            System.out.println(" tidBit existed !");
        }
    }

    public void removeTidbit(String id) {
        int check = check(id);
        if (check == -1) {
            listTidBit.remove(check);
        } else {
            System.out.println(" titBit not found! ");
        }
    }

    public void searchTidBit(String name) {
        for (TidBit tidBit : listTidBit) {
            if (tidBit.getName() == name) {
                tidBit.infoTidBit();
                System.out.println("--------------------");
            }
        }
    }

    public void searchTidBit() {
        for (TidBit tidBit : listTidBit) {
            System.out.println("-------------------------");
            tidBit.infoTidBit();
        }
    }

}
