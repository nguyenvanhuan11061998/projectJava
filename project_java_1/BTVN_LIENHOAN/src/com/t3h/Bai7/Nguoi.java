package com.t3h.Bai7;

public abstract class Nguoi {
    private String maHS;
    private String hoTen;
    private int tuoi;
    private int namSinh;
    private String queQuan;

    public Nguoi(String maHS, String hoTen, int tuoi, int namSinh, String queQuan) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public String getMaHS() {
        return maHS;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void intThongTin(){
        System.out.println("ma hoc sinh: "+maHS);
        System.out.println("ho ten: "+hoTen);
        System.out.println("tuoi: "+tuoi);
        System.out.println("nam sinh: "+namSinh);
        System.out.println("que quan: "+queQuan);
    }
}
