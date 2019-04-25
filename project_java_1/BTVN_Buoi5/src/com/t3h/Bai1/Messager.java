package com.t3h.Bai1;

public class Messager {
    private String userID;
    private String time;
    private String content;
    private String type;
    private String status;

    public String getUserID() {
        return userID;
    }

    public Messager(String userID, String time, String content, String type, String status) {
        this.userID = userID;
        this.time = time;
        this.content = content;
        this.type = type;
        this.status = status;
    }

    public void inThongTin(){
        System.out.println("userID: "+userID);
        System.out.println("time : "+time);
        System.out.println("content: "+content);
        System.out.println("type: "+type);
        System.out.println("status: "+status);
    }
}
