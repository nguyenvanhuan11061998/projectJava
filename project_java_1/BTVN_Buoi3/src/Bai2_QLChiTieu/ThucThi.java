package Bai2_QLChiTieu;

import java.util.ArrayList;
import java.util.List;

public class ThucThi {

    String A;
    String B;
    String C;
    String D;


    //bao cao tinh hinh thu chi
    void TgChi(String A) {
        this.A = A;
    }

    void TgVay(String B) {
        this.B = B;
    }

    void TgNo(String C) {
        this.C = C;
    }

    void TgThu(String D){
        this.D = D;
    }

    void bcKhoanChi( List<KhoanChi> Chi) {
        int tienChi = 0;

        for (int i = 0; i < Chi.size(); i++) {
            if (Chi.get(i).thoiGian == A) {
                System.out.println("Chi tien: ");
                System.out.println("so tien chi: "+ Chi.get(i).soTienChi);
                System.out.println("ly do: "+Chi.get(i).lyDo);
                System.out.println("nguoi thu huong: "+Chi.get(i).nguoiThuHuong);
                tienChi = tienChi + Chi.get(i).soTienChi;
                System.out.println("-=========================");
            }
        }
        System.out.println("tong tien chi ra la: " + tienChi);
    }


    //bao cao tinh hinh vay
    void bcKhoanVay(List<KhoanVay> Vay) {
        int tienVay = 0;
        for (int i = 0; i < Vay.size(); i++) {
            if (Vay.get(i).thoiGian == B) {
                System.out.println("nguoi vay: " + Vay.get(i).nguoiVay);
                System.out.println("so tien vay: " + Vay.get(i).soTienVay);
                System.out.println("thoi han vay: " + Vay.get(i).thoiHanVay);
                tienVay = tienVay + Vay.get(i).soTienVay;
                System.out.println("-=========================");
            }
        }
        System.out.println("tong tien cho vay la: " + tienVay);
    }


    void bcKhoanno(List<KhoanNo> No) {
        int tienNo = 0;
        for (int i = 0; i < No.size(); i++) {
            if (No.get(i).thoiGian == C) {
                System.out.println("chu no: " + No.get(i).nguoiChuNo);
                System.out.println("so tien no: " + No.get(i).soTienNo);
                System.out.println("thoi han no: " + No.get(i).thoiHanNo);
                tienNo = tienNo + No.get(i).soTienNo;
                System.out.println("-=========================");
            }
        }
        System.out.println("tong tien no la: " + tienNo);
    }

    void bcKhoanThu(List<KhoanThu> Thu) {
        int tienThu = 0;
        for (int i = 0; i < Thu.size(); i++) {
            if (Thu.get(i).thoiGian == D) {
                System.out.println("nguoi thu huong: "+Thu.get(i).nguoiThuHuong);
                System.out.println("so tien thu: "+Thu.get(i).soTienThu);
                System.out.println("ly do: "+Thu.get(i).lyDo);
                tienThu = tienThu+Thu.get(i).soTienThu;
                System.out.println("-=========================");
            }
        }
        System.out.println("tong tien thu duoc la: " + tienThu);
    }

}
