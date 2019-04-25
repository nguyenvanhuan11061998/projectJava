package Bai1_Animals;

public class Main {
    public static void main(String[] args) {
        Dogs dog = new Dogs("Cho dom",
                "Mau dom",
                "thu co vu",
                "tay Au",
                10,
                "danh hoi",
                "co dom tren long",
                "trung thanh");

        dog.inThongTin();
        dog.moTa();
        dog.sua();
        dog.coiNha();
        dog.soSanh();

        System.out.println("-===============================");

        Cats cat = new Cats("Meo muop",
                "Mau nau",
                "meo nha",
                "Tay A",
                10,
                "Nhin trong dem toi",
                "co van tren long",
                "de thuong");

        cat.inThongTin();
        cat.keu();
        cat.batChuot();
        cat.moTa();
        cat.soSanh();
    }
}
