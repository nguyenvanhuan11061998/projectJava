package com.t3h.Bai1;

import java.util.ArrayList;

public class MessagerManager {
    ArrayList<Messager> messagers = new ArrayList<>();

    private int check(String userID){
        for (int i = 0; i < messagers.size(); i++) {
            if(messagers.get(i).getUserID().equals(userID))
                return i;
        }
        return -1;
    }

    public void add(Messager messager){
        int check = check(messager.getUserID());
        if(check==-1){
            messagers.add(messager);
        }else{
            System.out.println(" mess existed !");
        }
    }

    public void edit(Messager messager){
        int check = check(messager.getUserID());
        if(check>-1){
            messagers.set(check,messager);
            System.out.println("update mess succsesfully");
        }else{
            System.out.println("mess not existed");
        }
    }

    public void remove(String userID){
        int check = check(userID);
        if(check>=0){
            messagers.remove(check);
            System.out.println("remove mess successfully");
        }else{
            System.out.println("mess not exist! ");
        }
    }

    public void printAll(){
        for (int i = 0; i < messagers.size(); i++) {
            messagers.get(i).inThongTin();
            System.out.println("----------------------------");
        }
    }
}
