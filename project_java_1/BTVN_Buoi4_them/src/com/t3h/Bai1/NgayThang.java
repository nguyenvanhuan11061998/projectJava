package com.t3h.Bai1;

import java.util.Scanner;

public class NgayThang {
    Scanner sc = new Scanner(System.in);
    private int month;
    private int year;


    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public NgayThang(int month, int year) {
        setMonth(month);
        setYear(year);
    }

    public void namNhuanKiemTra(NgayThang ngayThang) {
        switch (getMonth())
        {
            case 1:
                System.out.println("thang 1 nam "+getYear()+" co 31 ngay");
                break;
            case 2:
                System.out.println("thang 2 nam "+getYear()+" co 29 ngay");
                break;
            case 3:
                System.out.println("thang 3 nam "+getYear()+" co 31 ngay");
                break;
            case 4:
                System.out.println("thang 4 nam "+getYear()+" co 30 ngay");
                break;
            case 5:
                System.out.println("thang 5 nam "+getYear()+" co 31 ngay");
                break;
            case 6:
                System.out.println("thang 6 nam "+getYear()+" co 30 ngay");
                break;
            case 7:
                System.out.println("thang 7 nam "+getYear()+" co 31 ngay");
                break;
            case 8:
                System.out.println("thang 8 nam "+getYear()+" co 31 ngay");
                break;
            case 9:
                System.out.println("thang 9 nam "+getYear()+" co 30 ngay");
                break;
            case 10:
                System.out.println("thang 10 nam "+getYear()+" co 31 ngay");
                break;
            case 11:
                System.out.println("thang 11 nam "+getYear()+" co 30 ngay");
                break;
            case 12:
                System.out.println("thang 12 nam "+getYear()+" co 31 ngay");
                break;
                default:
                    System.out.println("thang nhap vao khong hop le.");
                    break;
        }
    }
    public void namKhongNhuanKiemTra(NgayThang ngayThang) {
        switch (getMonth())
        {
            case 1:
                System.out.println("thang 1 nam "+getYear()+" co 31 ngay");
                break;
            case 2:
                System.out.println("thang 2 nam "+getYear()+" co 28 ngay");
                break;
            case 3:
                System.out.println("thang 3 nam "+getYear()+" co 31 ngay");
                break;
            case 4:
                System.out.println("thang 4 nam "+getYear()+" co 30 ngay");
                break;
            case 5:
                System.out.println("thang 5 nam "+getYear()+" co 31 ngay");
                break;
            case 6:
                System.out.println("thang 6 nam "+getYear()+" co 30 ngay");
                break;
            case 7:
                System.out.println("thang 7 nam "+getYear()+" co 31 ngay");
                break;
            case 8:
                System.out.println("thang 8 nam "+getYear()+" co 31 ngay");
                break;
            case 9:
                System.out.println("thang 9 nam "+getYear()+" co 30 ngay");
                break;
            case 10:
                System.out.println("thang 10 nam "+getYear()+" co 31 ngay");
                break;
            case 11:
                System.out.println("thang 11 nam "+getYear()+" co 30 ngay");
                break;
            case 12:
                System.out.println("thang 12 nam "+getYear()+" co 31 ngay");
                break;
            default:
                System.out.println("thang nhap vao khong hop le.");
                break;
        }
    }

    public void kiemTra(NgayThang ngayThang){
        if((getYear() % 4 == 0) && (getYear() % 100 != 0)){
            namNhuanKiemTra(ngayThang);
        }else if((getYear() % 4 == 0)&&(getYear() % 100 == 0)){
            if(getYear() % 400 == 0){
                namNhuanKiemTra(ngayThang);
            }else{
                namKhongNhuanKiemTra(ngayThang);
            }
        }else{
            namKhongNhuanKiemTra(ngayThang);
        }
    }
}
