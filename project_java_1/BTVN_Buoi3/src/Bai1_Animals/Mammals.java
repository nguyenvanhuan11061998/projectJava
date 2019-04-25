package Bai1_Animals;

public abstract class Mammals {
    String ten;
    String mauSac;
    String chungLoai;
    String nguonGoc;
    int tuoi;
    String khaNang;
    String dacDiem;
    String dacTinh;

    public Mammals(String ten, String mauSac,
                   String chungLoai, String nguonGoc,
                   int tuoi, String khaNang,
                   String dacDiem, String dacTinh) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.chungLoai = chungLoai;
        this.nguonGoc = nguonGoc;
        this.tuoi = tuoi;
        this.khaNang = khaNang;
        this.dacDiem = dacDiem;
        this.dacTinh = dacTinh;
    }

    abstract void moTa();

    void inThongTin(){
        System.out.println("Ten dong vat: "+ten);
        System.out.println("Mau sac: "+mauSac);
        System.out.println("Chung loai: "+chungLoai);
        System.out.println("nguon Goc: "+ nguonGoc);
        System.out.println("tuoi: "+tuoi);
        System.out.println("kha Nang: "+khaNang);
        System.out.println("dac Diem: "+dacDiem);
        System.out.println(" dac tinh: "+dacTinh);
    }
}
