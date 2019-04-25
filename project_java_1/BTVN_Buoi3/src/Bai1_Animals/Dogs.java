package Bai1_Animals;

public class Dogs extends Mammals {

    public Dogs(String ten, String mauSac, String chungLoai, String nguonGoc, int tuoi, String khaNang, String dacDiem, String dacTinh) {
        super(ten, mauSac, chungLoai, nguonGoc, tuoi, khaNang, dacDiem, dacTinh);
    }

    @Override
    void moTa() {
        System.out.println(" pet trong nha");
    }

    void sua(){
        System.out.println("cho sua!");
    }

    void coiNha(){
        System.out.println("coi nha!");
    }

    void soSanh(){
        System.out.println("kha nang danh hoi tot!");
    }
    @Override
    void inThongTin() {
        super.inThongTin();
    }
}
