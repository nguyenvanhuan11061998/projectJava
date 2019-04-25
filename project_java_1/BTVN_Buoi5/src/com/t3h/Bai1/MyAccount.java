package com.t3h.Bai1;

public class MyAccount extends Account{
    private String pass;

    public void setPass(String pass) {
        this.pass = pass;
    }

    public MyAccount(String id, String name, int age, String email, String pass) {
        super(id, name, age, email);
        this.pass = pass;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("pass: "+pass);
    }

    public void updatePass(String pass){
        setPass(pass);
    }
}
