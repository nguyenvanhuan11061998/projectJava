package Bai1_Animals;

public class Cats extends Mammals {

    public Cats(String ten, String mauSac,
                String chungLoai, String nguonGoc,
                int tuoi, String khaNang,
                String dacDiem, String dacTinh) {
        super(ten, mauSac, chungLoai, nguonGoc, tuoi, khaNang, dacDiem, dacTinh);
    }

    @Override
    void moTa() {
        System.out.println("pet bat chuot!");
    }

    void keu(){
        System.out.println("keu meo meo!");
    }

    void batChuot(){
        System.out.println("meo bat chuot!");
    }

    void soSanh(){
        System.out.println("bat chuot rat tot!");
    }
    @Override
    void inThongTin() {
        super.inThongTin();
    }
}
