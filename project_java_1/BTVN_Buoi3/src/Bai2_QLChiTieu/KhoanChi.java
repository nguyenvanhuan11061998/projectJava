package Bai2_QLChiTieu;

public class KhoanChi extends QuanLy{
    int soTienChi;
    String lyDo;
    String nguoiThuHuong;



    public KhoanChi(int stt,String thoiGian, String diaDiem,
                    int soTienChi, String lyDo,
                    String nguoiThuHuong) {
        super(stt,thoiGian, diaDiem);
        this.soTienChi = soTienChi;
        this.lyDo = lyDo;
        this.nguoiThuHuong = nguoiThuHuong;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("so tien chi: "+ soTienChi);
        System.out.println("ly do: "+lyDo);
        System.out.println("nguoi thu huong: "+nguoiThuHuong);
    }
}
