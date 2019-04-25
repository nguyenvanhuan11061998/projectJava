public class NhanVien {
    String maNV;
    String ten;
    int tuoi;
    boolean gioiTinh;
    String diaChi;
    String congTy;
    int luong;
    String chucVu;

    void nhap(String gtMaNV,
              String gtTen,
              int gtTuoi,
              boolean gtGioiTinh,
              String gtDiaChi,
              String gtCongTy,
              int gtLuong,
              String gtChucVu){
        maNV = gtMaNV;
        ten = gtTen;
        tuoi = gtTuoi;
        gioiTinh = gtGioiTinh;
        diaChi = gtDiaChi;
        congTy = gtCongTy;
        luong = gtLuong;
        chucVu = gtChucVu;
    }

    void lamViec(){
        System.out.println("Nhan vien lam viec");
    }

    void hop(){
        System.out.println("Nhan vien hop");
    }

    void baoCao(){
        System.out.println("Nhan vien bao cao");
    }

    void inThongTin(){
        System.out.println("Ma Nhan vien : "+ maNV);
        System.out.println("Ten Nhan vien : "+ ten);
        System.out.println("Tuoi Nhan vien : "+ tuoi);
        System.out.println("Dia chi Nhan vien : "+ diaChi);
        System.out.println("Ten Nhan vien : "+ ten);
        if(gioiTinh == true){
            System.out.println("Gioi tinh : Nam");
        }else{
            System.out.println("Gioi tinh Nu");
        }
        System.out.println("Cong ty : "+ congTy);
        System.out.println("Luong Nhan vien : "+ luong);
        System.out.println("Chuc vu Nhan vien : "+ chucVu);
    }
}
