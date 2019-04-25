package com.t3h.Bai1;

public class News {
    private String title;
    private String linkDetail;
    private String imgLink;
    private String date;

    public News(String title, String linkDetail, String imgLink, String date) {
        this.title = title;
        this.linkDetail = linkDetail;
        this.imgLink = imgLink;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getLinkDetail() {
        return linkDetail;
    }

    public String getImgLink() {
        return imgLink;
    }

    public String getDate() {
        return date;
    }

    public void inThongTin(){
        System.out.println("tittle: "+title);
        System.out.println("link Detail: "+linkDetail);
        System.out.println("img link: "+imgLink);
        System.out.println("date: "+date);
    }
}
