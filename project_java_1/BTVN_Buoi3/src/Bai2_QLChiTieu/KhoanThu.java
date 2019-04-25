package Bai2_QLChiTieu;

public class KhoanThu extends QuanLy{
    int soTienThu;
    String lyDo;
    String nguoiThuHuong;


    public KhoanThu(int stt,String thoiGian, String diaDiem,
                    int soTienThu, String lyDo, String nguoiThuHuong) {
        super(stt,thoiGian, diaDiem);
        this.soTienThu = soTienThu;
        this.lyDo = lyDo;
        this.nguoiThuHuong = nguoiThuHuong;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("so tien thu: "+soTienThu);
        System.out.println("ly do: "+lyDo);
        System.out.println("nguoi thu huong: "+nguoiThuHuong);
    }
}
