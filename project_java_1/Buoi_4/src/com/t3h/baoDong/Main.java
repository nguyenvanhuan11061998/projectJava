package com.t3h.baoDong;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo(10,20);
        System.out.println(demo.getA());
        demo.setA(100);
        System.out.println(demo.getA());
    }
}
