package com.t3h.mang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MangDong {
    private ArrayList<Integer>  arr = new ArrayList<>();

    public void add(Integer value){
        arr.add(value);
    }

    public  void add(int index, Integer value){
        arr.add(index,value);
    }

    public void addAll(ArrayList<Integer> arrExtendtion ){
        arr.addAll(arrExtendtion);
    }

    public void addAll(int index,ArrayList<Integer> arrExtendtion ){
        arr.addAll(index,arrExtendtion);
    }

    public void set(int index,Integer value){
        arr.set(index,value);
    }

    public  void remove(int index){
        arr.remove(index);
    }

    public void clear(){
        arr.clear();
    }

    public int indexOff(Integer value){
        return  arr.indexOf(value);
    }

    public boolean checkContain(ArrayList<Integer> arr){
        return this.arr.containsAll(arr);
    }

    public void inMang(){
        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+"\t");
        }
    }

    public void sort(){
        arr.sort(com);
    }

    private Comparator<Integer> com = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return 1;
            }
            return -1;
        }
    };

    public void shuffle(){
        Collections.shuffle(arr);
    }
}
