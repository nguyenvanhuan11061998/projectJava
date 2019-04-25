package com.t3h.Bai1;

import java.util.ArrayList;
import java.util.Comparator;

public class FriendManager {
    private ArrayList<Friends> friends = new ArrayList<>();

    private int checkID(String id){
        for (int i = 0; i < friends.size(); i++) {
            if(friends.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }

    public void add(Friends friend){
        int check = checkID(friend.getId());
        if(check==-1){
            friends.add(friend);
        }else{
            System.out.println(" friend existed !");
        }
    }

    public void edit(Friends friend){
        int check = checkID(friend.getId());
        if(check>-1){
            friends.set(check,friend);
            System.out.println("update friend succsesfully");
        }else{
            System.out.println("friend not existed");
        }
    }

    public void remove(String id){
        int check = checkID(id);
        if(check>=0){
            friends.remove(check);
            System.out.println("remove friend successfully");
        }else{
            System.out.println("friend not exist! ");
        }
    }

    public void search(String id){
        int check = checkID(id);
        if(check >=0) {
            for (int i = 0; i < friends.size(); i++) {
                if (id == friends.get(i).getId()) {
                    friends.get(i).inThongTin();
                    System.out.println("-----------------------");
                }
            }
        }else{
            System.out.println("friend not found");
        }
    }

    public void soft(){
        friends.sort(comparator);
    }


    private Comparator<Friends> comparator = new Comparator<Friends>() {
        @Override
        public int compare(Friends o1, Friends o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public void printAll(){
        for (int i = 0; i < friends.size(); i++) {
            friends.get(i).inThongTin();
            System.out.println("----------------------------");
        }
    }
}
