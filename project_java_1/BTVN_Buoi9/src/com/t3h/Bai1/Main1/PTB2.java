package com.t3h.Bai1.Main1;


public class PTB2 {
    public double GiaiPT1(String a, String b, String c){
        double so1 = Integer.parseInt(a);
        double so2 = Integer.parseInt(b);
        double so3 = Integer.parseInt(c);
        double nghiem, delta = (so2*so2 - 4*so1*so3);
        if(delta<0){
            return 0;
        }else if(delta == 0){
            return ((double)-so2 )/2*so1;
        }else{
            return ((double)(-so2 + Math.sqrt(delta))/(2*so1));
        }
    }


    public double GiaiPT2(String a, String b, String c){
        double so1 = Integer.parseInt(a);
        double so2 = Integer.parseInt(b);
        double so3 = Integer.parseInt(c);
        double nghiem, delta = (so2*so2 - 4*so1*so3);
        if(delta<0){
            return 0;
        }else if(delta == 0){
            return ((double)-so2 )/2*so1;
        }else{
            return ((double)(-so2 - Math.sqrt(delta))/(2*so1));
        }
    }

    public String kt(String a, String b, String c){
        String chuoi2 = "isNum";
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            Integer.parseInt(c);
        }catch (Exception ex){
            String chuoi = "notNum";
            return chuoi;
        }return chuoi2;
    }

}