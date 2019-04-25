package Bai2_QLChiTieu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        KhoanChi KC1 = new KhoanChi(1,
                "21/03/2016",
                "Lớp LAND1602E",
                300000,
                "Mua đồ sinh nhật các bạn tháng 3",
                "Lớp LAND1602E");

        KhoanChi KC2 = new KhoanChi(2,
                "21/03/2016",
                "	Cty FPT",
                35000,
                "Ăn trưa",
                "Quán ăn");

        KhoanChi KC3 = new KhoanChi(3,
                "21/03/2016",
                "Café Phố",
                45000,
                "Uống café capuchio",
                "Café Cong");

        KhoanThu KT1 = new KhoanThu(1,
                "21/03/2016	",
                "Cty FPT",
                5000000,
                "Lương tháng 3	",
                "Tôi");

        KhoanThu KT2 = new KhoanThu(2,
                "21/03/2016	",
                "Nhà riêng",
                2500000,
                "Tiền phí trọ nhà anh Nam",
                "Tôi");

        KhoanVay KV1 = new KhoanVay(1,
                "12/03/2016",
                "Nhà riêng",
                1000000,
                "Vay mua tủ lạnh",
                "Chị Hồng",
                "7 ngày",
                0,
                "12/03/2016",
                false);

        KhoanVay KV2 = new KhoanVay(2,
                "15/03/2016",
                "Nhà riêng",
                10000000,
                "Vay mua đất",
                "Anh Hoàng",
                "30 ngày",
                2000,
                "15/04/2016",
                false);

        KhoanNo KN1 = new KhoanNo(1,
                "18/03/2016",
                "Ngân hàng",
                10000000,
                "Vay mua máy giặt",
                "Tôi",
                "60 ngày",
                1000,
                "18/05/2016",
                false);

        KhoanNo KN2 = new KhoanNo(2,
                "19/03/2016",
                "MediaMart",
                8000000,
                "Vay mua điện thoại",
                "Tôi",
                "60 ngày",
                0,
                "19/05/2016",
                false);


//Hien thi thong tin
        System.out.println("cac khoan chi la: ");
        KC1.inThongTin();
        System.out.println("-------------------------");
        KC2.inThongTin();
        System.out.println("-------------------------");
        KC3.inThongTin();
        System.out.println("\n\n");
        System.out.println("-=======================");
        System.out.println("\n\n cac khoan thu la: ");
        KT1.inThongTin();
        System.out.println("-------------------------");
        KT2.inThongTin();
        System.out.println("\n\n");
        System.out.println("-=========================");
        System.out.println("\n\n cac khoan vay la: ");
        KV1.inThongTin();
        System.out.println("-------------------------");
        KV2.inThongTin();
        System.out.println("\n\n");
        System.out.println("-============================");
        System.out.println("\n\n cac khoan no la: ");
        KN1.inThongTin();
        System.out.println("-------------------------");
        KN2.inThongTin();


//Them cac khoan muc vao list
        List<KhoanChi> listKC = new ArrayList<KhoanChi>();
        listKC.add(KC1);
        listKC.add(KC2);
        listKC.add(KC3);

        List<KhoanThu> listKT = new ArrayList<KhoanThu>();
        listKT.add(KT1);
        listKT.add(KT2);

        List<KhoanVay> listKV = new ArrayList<KhoanVay>();
        listKV.add(KV1);
        listKV.add(KV2);

        List<KhoanNo> listKN = new ArrayList<KhoanNo>();
        listKN.add(KN1);
        listKN.add(KN2);

//Bao cao cac muc

        System.out.println("\n\n\n");
        System.out.println("bao cao chi tieu, vay no");
        ThucThi TT = new ThucThi();
        System.out.println("-=================-");


        TT.TgChi("21/03/2016");
        TT.bcKhoanChi(listKC);
        System.out.println("-=================-");


        TT.TgVay("15/03/2016");
        TT.bcKhoanVay(listKV);
        System.out.println("-===================");


        TT.TgNo("19/03/2016");
        TT.bcKhoanno(listKN);
        System.out.println("-==================-");

        TT.TgThu("21/03/2016	");
        TT.bcKhoanThu(listKT);
    }
}
