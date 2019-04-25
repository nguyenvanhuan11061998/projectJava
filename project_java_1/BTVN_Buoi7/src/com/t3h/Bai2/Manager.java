package com.t3h.Bai2;

import java.io.File;
import java.io.FileInputStream;
import java.security.PrivateKey;
import java.util.ArrayList;

public class Manager {
    private ArrayList<User> listUser = new ArrayList<>();
    private int countUser;
    private String path = "D:/UserManager/data.txt";

    public Manager() {
        try {
            File file = new File(path);
            if(file.exists() == false){
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }




    private int checkUser(String userName){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i).getUserName().equals(userName)){
                return i;
            }
        }
        return -1;
    }

    private  int checkPass(String password){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i).getPassword().equals(password)){
                return i;
            }
        }
        return -1;
    }

    public void register(User user){
        int check = checkUser(user.getUserName());
        if(check == -1){
            listUser.add(user);
            countUser = countUser+1;
        }else{
            System.out.println("user da ton tai");
        }
    }

    public int  checkLogin(String userName, String password){
        for (int i = 0; i < listUser.size(); i++) {
            if(listUser.get(i).getUserName().equals(userName) && listUser.get(i).getPassword().equals(password)){
                return i;
            }
        }
        return -1;
    }

    public void loGin(String userName, String password){
        int check = checkLogin(userName,password);
        if(check == -1){
            System.out.println("Tai khoan hoac mat khau sai");
        }else{
            System.out.println("dang nhap thanh cong :"+check);
        }
    }

    public void updateUserNotFull(User user){
        int check = checkLogin(user.getUserName(),user.getPassword());
        if(check == -1){
            System.out.println("tai khoan khong ton tai");
        }else{
            listUser.get(check).updateInfor(user);
        }
    }

    public void saveAllUser(){
        for (int i = 0; i < listUser.size(); i++) {
            listUser.get(i).writeInfor(path,listUser.get(i));
            System.out.println();
        }
        System.out.println("tat ca cac user da duoc luu tru");
    }

    public void xuLyString(String s){
        String[] arr = s.split("\n");
        for (String s1 :arr) {
            String[] arr1 = s1.split(" ");
            User user = new User(arr1[0],arr1[1],arr1[2],arr1[3],arr1[4],arr1[5]);
            listUser.add(user);
        }
    }

    public void getAllUser(){
        listUser.clear();
        File file = new File(path);
        try {
            FileInputStream inputStream = new FileInputStream(file);
            byte[] b = new byte[1024];
            int count = inputStream.read(b);
            StringBuilder builder = new StringBuilder();
            while (count != -1){
                builder.append(new String(b,0,count));
                count = inputStream.read(b);
            }
            inputStream.close();

            xuLyString(builder.toString());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void showAllUser(){
        for (int i = 0; i < listUser.size(); i++) {
            listUser.get(i).slowInfor();
            System.out.println("-------------------------------");
        }
    }

    public void deleteUser(String userName){
        int check = checkUser(userName);
        if(check == -1){
            System.out.println("user Name khong ton tai ");
        }else{

        }
    }


}
