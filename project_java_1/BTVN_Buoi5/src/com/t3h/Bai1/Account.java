package com.t3h.Bai1;

public abstract class Account {
    private String id;
    private String name;
    private int age;
    private String email;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account(String id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void inThongTin(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("email: "+email);
    }
}
