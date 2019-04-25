package com.t3h.Bai2;

import java.io.File;
import java.io.FileOutputStream;

public class User {
    private String userName;
    private String password;
    private String name;
    private String dateOfBirth;
    private String age;
    private String job;

    public User(String name, String userName, String password, String dateOfBirth, String age, String job) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.job = job;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public void slowInfor(){
        System.out.println("Name: "+name);
        System.out.println("UserName: "+userName);
        System.out.println("Password: "+password);
        System.out.println("Date Of Birth: "+dateOfBirth);
        System.out.println("Age: "+age);
        System.out.println("Job: "+job);
    }

    public void updateInfor(User user){
        this.name = user.name;
        System.out.println("user Name : "+user.userName);
        System.out.println("password: "+user.password);
        this.dateOfBirth = user.dateOfBirth;
        this.age = user.age;
        this.job = user.job;

        System.out.println("cap nhat thanh cong! ");
    }

    public void changePassword(String oldPass, String newPass){
        if(oldPass.equals(newPass)){
            System.out.println("khong hop le! ");
        }else{
            oldPass=newPass;
        }
    }

    public void writeInfor(String path, User user){
        try {
            File file = new File(path);

            FileOutputStream fileOutputStream =
                    new FileOutputStream(file,true);
            fileOutputStream.write(user.name.getBytes());
            fileOutputStream.write(user.userName.getBytes());
            fileOutputStream.write(user.password.getBytes());
            fileOutputStream.write(user.dateOfBirth.getBytes());
            fileOutputStream.write(user.age.getBytes());
            fileOutputStream.write(user.job.getBytes());
            fileOutputStream.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
