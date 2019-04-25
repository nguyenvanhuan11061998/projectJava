package com.t3h.Bai2;

public class Main {
    public static void main(String[] args) {
        ChuanHoa chuanHoa = new ChuanHoa();
        String chuoi = "3+43-6+5-445++--43+445-32+-3";
        chuanHoa.chuoiBanDau(chuoi);
        System.out.println("\n\n-======= Chuoi sau khi chuan hoa ========-");
        chuanHoa.inChuoi(chuoi);
        System.out.println("\n\n-======== Tong Chuoi ==========-");
        chuanHoa.tinhTong(chuoi);

    }
}
