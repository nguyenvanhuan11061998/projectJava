package com.t3h.NgoaiLe;

public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        main.exception();

        MyException myException = new MyException();
        myException.print();

    }
    private void exception(){
        try {
            String s = "23a2";
            int v = Integer.parseInt(s);
            System.out.println(v);
            char c = s.charAt(100);
            System.out.println(c);
        }catch (Exception  ex){
            System.out.println("xay ra ngoai le");
            ex.printStackTrace();
        }
        System.out.println("ket thuc");
    }
}
