package HinhHoc;

public class Main {
    public static void main(String[] args) {
        HinhTamGiac TG = new HinhTamGiac("Hinh tam giac",5,6,7);
        HinhChuNhat CN = new HinhChuNhat("Hinh chu nhat",4,6);

        TG.inThongTin();
        TG.chuVi();
        TG.dienTich();

        System.out.println("-=================================-");


        CN.inThongTin();
        CN.chuVi();;
        CN.dienTich();
    }
}
