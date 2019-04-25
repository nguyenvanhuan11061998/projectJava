package com.t3h.Bai3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addProvince("01","Ha Noi");
        menu.addProvince("02","Bắc Giang");
        menu.addProvince("03","Bắc Kạn");

        menu.addTidBit("01",new TidBit("1","Bún chả Hà Nội",
                "Nhắc đến ẩm thực miền Bắc đặc biệt là đặc sản Hà Nội không thể biết đến bao giờ mới kể hết các món ...",
                "http://www.dacsanthonque.com/2014/05/bun-cha-ha-noi-nhat-inh-phai-khi-ra-bac.html",
                "http://1.bp.blogspot.com/-Sbk1ElpMGq0/U3RtcjJSBYI/AAAAAAAACVQ/ujLwwtDJcv8/s200-c/bun-cha-ha-noi.jpg"));
        menu.addTidBit("01",new TidBit("2","Bún tôm Hồ Tây",
                "Bánh tôm Hồ Tây, bánh tôm đặc sản Hà Nội , thưởng thức những món ngon đặc sản tại Hà Nội . Hà Nội th...",
                "http://www.dacsanthonque.com/2014/05/banh-tom-ho-tay-mon-ngon-ac-san-cua-ha.html",
                "http://1.bp.blogspot.com/-8-mLyT9CwCM/U3MZlDWBfJI/AAAAAAAACT8/_lhy5C0I7uY/s200-c/banh_tom.jpg"));

        menu.addTidBit("02",new TidBit("1","Chè đõ đãi",
                "Trong những món ngon khó quên đặc sản ở Bắc Giang , không thể không kể đến món chè đỗ đãi (đậu đãi) ...",
                "http://www.dacsanthonque.com/2014/05/che-o-ai-mon-ngon-ac-san-cua-bac-giang.html",
                "http://4.bp.blogspot.com/-52aBf8BC4lI/U37i3dmZj7I/AAAAAAAAChc/r42wrJ_RytE/s200-c/che-do-dai-dac-san-bac-giang-ce4c.jpg"));
        menu.addTidBit("02",new TidBit("2","Đặc sản rựu men lá",
                "Rựu men lá , một tên loại rựu vô cùng lạ tai chắc hẳn chưa nhiều người miền trong biết được loại rựu...",
                "http://www.dacsanthonque.com/2014/05/ac-san-ruu-men-la-cua-nguoi-nung-bac.html",
                "http://2.bp.blogspot.com/-S18Y7mGHDac/U3ytshqpeKI/AAAAAAAACgg/h2-P8h2tOgw/s200-c/ruou2.jpg"));

        menu.addTidBit("03",new TidBit("1","Đặc sản măng Vầu",
                "Cứ đến đầu tháng Chạp âm lịch, khi cơn mưa phùn bắt đầu đổ xuống, người dân trên khắp các bản làng ở...",
                "http://www.dacsanthonque.com/2014/05/ac-san-mang-vau-bac-kan.html",
                "http://3.bp.blogspot.com/-KD76GyWwASA/U37ouhRlH8I/AAAAAAAACiM/qPr_fHTs_2Q/s200-c/mang+vau2.jpg"));
        menu.addTidBit("03",new TidBit("2","Bánh khẩu thuy",
                "Vào mỗi dịp lễ hội Lồng Tồng, thứ bánh ngon không thể thiếu để dâng lên trời đất, để cúng thần linh ...",
                "http://www.dacsanthonque.com/2014/05/banh-khau-thuy-mot-net-rat-rieng-cua.html",
                "http://2.bp.blogspot.com/-cdvjozytBlw/U37pNxuIbyI/AAAAAAAACiU/4sbkVfKG36o/s200-c/khau+thuy.jpg"));


        System.out.println("------------Mon Bun Cha Ha Noi-------------");
        menu.litedTidBit("01","Bún chả Hà Nội");

        System.out.println("\n-----------Thong Tin Mon An Ha Noi----------");
        menu.searchTidBit("01");

        System.out.println("\n-----------Thong Tin Mon An Tinh Bac Giang------------");
        menu.searchTidBit("02");

        System.out.println("\n---------Thong tin mon an tinh Bac Kan--------");
        menu.searchTidBit("03");

        System.out.println("\n-----------Them Tinh Hai Duong----------------");
        menu.addProvince("04","Hai Duong");

        System.out.println("\n----------Xoa tinh co ma 04---------------");
        menu.removePro("04");
    }
}
