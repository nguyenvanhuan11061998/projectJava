package HinhHoc;

public class HinhChuNhat extends  HinhHoc {

    float chieuDai;
    float chieuRong;

    public HinhChuNhat(String ten, float chieuDai, float chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
    }

    @Override
    void chuVi() {
        float chuVi = (chieuDai + chieuRong)*2;
        System.out.println("chu vi hinh chu nhat: "+chuVi);
    }

    @Override
    void dienTich() {
        float dienTich = chieuDai*chieuRong;
        System.out.println(" dien tich hinh chu nhat la: "+dienTich);
    }
}
