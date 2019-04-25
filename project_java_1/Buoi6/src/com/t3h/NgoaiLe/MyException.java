package com.t3h.NgoaiLe;

import java.util.ArrayList;

public class MyException {
    private String[] arr = new String[5];

    public MyException(){
        arr[0] = "hello";
        arr[1] = "world";
        arr[2] = "Hi";
        arr[3] = "Viet Nam";
        arr[4] = "Vo Dich";
    }

    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toUpperCase());
        }
    }

}
