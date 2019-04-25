public class SinhVien {
    String maSV;
    String ten;
    int tuoi;
    boolean gioiTinh;
    String diaChi;
    String sdt;
    float diem;

    void nhap(String giaTriMaSV,
              String giaTriTen,
              int giaTriTuoi,
              boolean giaTriGioiTinh,
              String giaTriDiaChi,
              String giaTriSDT,
              float giaTriDiem){
        maSV = giaTriMaSV;
        ten = giaTriTen;
        tuoi = giaTriTuoi;
        gioiTinh = giaTriGioiTinh;
        diaChi = giaTriDiaChi;
        sdt = giaTriSDT;
        diem = giaTriDiem;
    }

    void hoc(){
        System.out.println("Sinh vien hoc bai");
    }

    void lamBai(){
        System.out.println("Sinh vien lam bai");
    }

    void thi(){
        System.out.println("Sinh vien thi");
    }

    void inThongTin(){
        System.out.println("Ma Sinh Vien: "+ maSV);
        System.out.println("Ho Ten: "+ ten);
        System.out.println("Tuoi : "+ tuoi);
        System.out.println("Dia Chi: "+ diaChi);
        System.out.println("SDT: "+ sdt);
        if(gioiTinh == true){
            System.out.println("Gioi Tinh: Nam ");
        }else{
            System.out.println("Gioi Tinh : Nu ");
        }
        System.out.println("Diem: "+ diem);
    }
}
