package com.t3h.Bai2;

import java.util.Random;

public class Mang {
    private Integer[] A = new Integer[10];
    private Random random = new Random();
//phan a
    public void themPtu(){
        for (int i = 0; i < A.length; i++) {
            A[i] = random.nextInt(90000)+10000;
        }
    }
    
    public void inMang(){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"\t");
        }
        System.out.println();
    }

//phan b
    private int kiemTraSoLe(int a){
        int soLe=0;
        while(a>0){
            int b = a%10;
            if(b%2 == 1 )
                soLe= soLe+1;
            a = a/10;
        }
        return soLe;
    }



    public void kiemTra(){
        int[] b = new int[10];

        for (int i = 0; i < A.length; i++) {
            b[i]= kiemTraSoLe(A[i]);
        }

        int max = b[0];
        for (int i = 0; i < b.length; i++) {
            if(max < b[i])
                max = b[i];
        }


        System.out.print("so co  nhieu chu so le nhat ("+max+" so le) la: ");
        for (int i = 0; i < A.length; i++){
            if(max == kiemTraSoLe(A[i]) ){
                System.out.print(A[i]+"\t");
            }
        }
    }

//Phan c
    private int timTongLonNhat(){
        int max =0;
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i+1; j < A.length - 1; j++) {
                for (int k = j+1; k < A.length; k++) {
                         int a = A[i]+A[j]+A[k];
                         if(max < a && a < 100000)
                             max = a;
                }
            }
        }
        return max;
    }

    public void timSo(){
        int max = timTongLonNhat();
        if(max == 0){
            System.out.println("moi tong 3 so deu lon hon 50000");
        }else{
            System.out.print("3 so co tong lon nhat khong vuot qua 50000 la: ");
            for (int i = 0; i < A.length - 2; i++) {
                for (int j = i+1; j < A.length - 1; j++) {
                    for (int k = j+1; k < A.length; k++) {
                        int a = A[i]+A[j]+A[k];
                        if(a==max){
                            System.out.print(A[i]+" ; "+A[j]+" ; "+A[k]);
                        }
                    }
                }
            }
        }
    }

}
