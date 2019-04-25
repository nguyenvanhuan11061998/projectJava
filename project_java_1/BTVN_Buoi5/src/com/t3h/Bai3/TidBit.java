package com.t3h.Bai3;

public class TidBit {
    private String id;
    private String name;
    private String description;
    private String linkDetail;
    private String linkIcon;

    public TidBit(String id, String name, String description, String linkDetail, String linkIcon) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkDetail = linkDetail;
        this.linkIcon = linkIcon;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLinkDetail() {
        return linkDetail;
    }

    public String getLinkIcon() {
        return linkIcon;
    }

    public void infoTidBit(){
        System.out.println("Ma mon: "+id);
        System.out.println("Ten Mon: "+name);
        System.out.println("Mo Ta: "+description);
        System.out.println("Chi tiet: "+linkDetail);
        System.out.println("Bieu tuong: "+linkIcon);
    }

}
