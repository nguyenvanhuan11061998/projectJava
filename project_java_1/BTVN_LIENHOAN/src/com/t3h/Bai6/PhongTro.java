package com.t3h.Bai6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhongTro {
    private String soPhong;
    private String loaiPhong;
    private String soNgayTro;
    private int giaPhong;
    private ArrayList<Nguoi> listKhach = new ArrayList<>();

    public PhongTro(String soPhong, String loaiPhong, String soNgayTro, int giaPhong) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.soNgayTro = soNgayTro;
        this.giaPhong = giaPhong;
    }

    public String getSoPhong() {
        return soPhong;
    }

    private int checkHoTen(String hoTen){
        for (int i = 0; i < listKhach.size(); i++) {
            if(listKhach.get(i).getHoTen().equals(hoTen)){
                return i;
            }
        }return -1;
    }

    public void addNguoi(Nguoi nguoi){
        int check = checkHoTen(nguoi.getHoTen());
        if(check<0){
            listKhach.add(nguoi);
        }else{
            System.out.println("nguoi da ton tai");
        }
    }

    public void inThongTin(){
        for (Nguoi nguoi : listKhach) {
            System.out.println("-----------------------");
            nguoi.inThongTin();
        }
    }

    public void inThongTin2(String HoTen){
        int check = checkHoTen(HoTen);
        if(check == -1){
            System.out.println("khong co nguoi nao ten nhu vay");
        }else{
            listKhach.get(check).inThongTin();
        }
    }
}
