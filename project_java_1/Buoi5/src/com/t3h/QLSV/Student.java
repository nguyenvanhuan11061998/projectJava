package com.t3h.QLSV;

public class Student {
    private String id;
    private String name;
    private String age;
    private boolean sex;
    private float score;

    public String getId() {
        return id;
    }

    public float getScore() {
        return score;
    }

    public Student(String id, String name, String age, boolean sex, float score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
    }

    public void print() {
        System.out.println("ma sinh vien: " + id);
        System.out.println("Ten: " + name);
        System.out.println("tuoi: " + age);
        System.out.println("gioi tinh: " + (sex ? "Nam" : "Nu"));
        System.out.println("diem: " + score);
    }
}
