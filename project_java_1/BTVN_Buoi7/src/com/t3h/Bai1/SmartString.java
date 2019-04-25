package com.t3h.Bai1;

import java.util.ArrayList;

public class SmartString {
    private String text;

    public SmartString(String text) {
        this.text = text;
    }

    ArrayList<News> listNews = new ArrayList<>();

    ArrayList<String> listString = new ArrayList<>();

    private void xuLyText() {
        String[] arr = text.split("</item>");
        for (String s : arr) {
            listString.add(s);
        }
    }

    private News xuLyOneNew(String chuoi) {
        String title, imgLink, linkDetail, date;
        int index1 = chuoi.indexOf("<title>");
        int lastIndex1 = chuoi.lastIndexOf("</title>");
        title = chuoi.substring(index1+16, lastIndex1-3);

        int index2 = chuoi.indexOf("<link>");
        int lastIndex2 = chuoi.lastIndexOf("</link>");
        linkDetail = chuoi.substring(index2+15, lastIndex2-3);

        int index3 = chuoi.indexOf("img");
        int lastIndex3 = chuoi.lastIndexOf("/></a>]]></");
        imgLink = chuoi.substring(index3+9, lastIndex3-2);

        int index4 = chuoi.indexOf("pubDate");
        int lastIndex4 = chuoi.lastIndexOf("pubDate");
        date = chuoi.substring(index4+17, lastIndex4-5);

        News new1 = new News(title,linkDetail,imgLink,date);

        return new1;
    }

    public void Implement(){
        xuLyText();
        for (int i = 0; i < listString.size()-1; i++) {
            News item = xuLyOneNew(listString.get(i));
            listNews.add(item);
        }
    }

    public void inThongTin(){
        Implement();
        for (News s:listNews) {
            System.out.println("------------------------------");
            s.inThongTin();
        }
    }

}
