package com.t3h.QLSV;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    private int checkExits(String id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }

    public void add(Student student){
        int exits = checkExits(student.getId());
        if(exits == -1){
            students.add(student);
        }else{
            System.out.println("Sinh vien da ton tai!");
        }
    }

    public void update(Student student){
        int exits = checkExits(student.getId());
        if(exits>=0){
            students.set(exits,student);
            System.out.println("update thanh cong! ");
        }else{
            System.out.println("Sinh vien ko ton tai!");
        }
    }

    public void remove(String id){
        int exits = checkExits(id);
        if(exits>=0){
            students.remove(exits);
        }else{
            System.out.println("Sinh vien khong ton tai");
        }
    }

    public void sort(){
        students.sort(comparator);
    }

    private Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getScore() > o2.getScore()) {
                return -1;
            }
            return 1;
        }
    };

    public void printAllStudent(){
        for(Student s : students){
            System.out.println("--------------------------------");
            s.print();
        }
    }

}
