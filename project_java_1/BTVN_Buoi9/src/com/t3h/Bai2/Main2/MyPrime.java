package com.t3h.Bai2.Main2;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPrime {
    private String path = "D:/soNT.txt";

    public int kiemTraSo(String a){
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(a);
        if(matcher.matches()){
            int kq;
            int soA = Integer.parseInt(a);
            kq = kiemTraSoNto(soA);
            return kq;
        }
        return -3;
    }



    public int kiemTraSoNto(int n){

            if(n<=1){
                return -2;
            }else if(n == 2 || n == 3){
                return -1;
            }else{
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if(n%i == 0){
                        return -2;
                    }
                }
            }
            return -1;
    }


    public int ktLietKe(String a){
        Pattern pattern = Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(a);
        if(matcher.matches()){
            int soA = Integer.parseInt(a);
            return soA;
        }
        return -1;
    }

    public String MangPTu(int a){
        String chuoi1 ="";
        for (int i = 2; i < a; i++) {
            int kt = kiemTraSoNto(i);
            if(kt == -1){
                String so = String.valueOf(i);
                chuoi1 = chuoi1 + so;
                String dau = ",";
                chuoi1 = chuoi1 + dau;
            }
        }

        chuoi1 = "Các số nguyên tố nhỏ hơn "+a+" la: "+chuoi1;
        String chuoi2 = "so Nguyên Tố "+a;
        writeFile(chuoi2,chuoi1);
        return chuoi1;
    }




    public void writeFile(String chuoi1, String chuoi2){
        try {
            File file = new File(path);
            if(file.exists()== false){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream outputStream =
                    new FileOutputStream(file,false);
            chuoi1 = chuoi1 + "\n";
            chuoi2 = chuoi2 + "\n";
            outputStream.write(chuoi1.getBytes());
            outputStream.write(chuoi2.getBytes());
            outputStream.close();


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
