package com.t3h.QLSV;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.add(new Student("1234435","Nguyen Van Huan","20",true,9.0f));
        manager.add(new Student("32554454","Nguyen Tuan Dat","20", true,8.9f));
        manager.add(new Student("54768436","Nguyen Van A","32",false,7.6f));

        manager.printAllStudent();
        System.out.println("-===================update================");
        manager.update(new Student("54768436","Nguyen Van B","43",false,8.7f));
        manager.printAllStudent();
        System.out.println("-===================sort==================");
        manager.sort();
        manager.printAllStudent();
    }
}
