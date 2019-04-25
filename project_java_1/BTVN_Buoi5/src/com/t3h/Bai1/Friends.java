package com.t3h.Bai1;

public class Friends extends Account {
    private String status;

    public Friends(String id, String name, int age, String email, String status) {
        super(id, name, age, email);
        this.status = status;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Status: "+status);
    }
}