package Bai2_QLChiTieu;

public class KhoanVay extends QuanLy{
    int soTienVay;
    String nguoiVay;
    String thoiHanVay;
    int laiSuatNgay;
    String ngayTra;
    String lyDoVay;
    boolean xacNhanTra;

    public KhoanVay(int stt, String thoiGian, String diaDiem,
                    int soTienVay,String lyDoVay, String nguoiVay,
                    String thoiHanVay, int laiSuatNgay,
                    String ngayTra, boolean xacNhanTra) {
        super(stt, thoiGian, diaDiem);
        this.soTienVay = soTienVay;
        this.lyDoVay = lyDoVay;
        this.nguoiVay = nguoiVay;
        this.thoiHanVay = thoiHanVay;
        this.laiSuatNgay = laiSuatNgay;
        this.ngayTra = ngayTra;
        this.xacNhanTra = xacNhanTra;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("so tien vay: "+soTienVay);
        System.out.println("nguoi vay: "+nguoiVay);
        System.out.println("thoi han vay: "+thoiHanVay);
        System.out.println("lai suat ngay: "+laiSuatNgay);
        System.out.println("ngay tra: "+ngayTra);
        System.out.println("ly do vay: "+lyDoVay);
        String xn = xacNhanTra? "Da tra":"Chua Tra";
        System.out.println("xac nhan tra: "+xn);
    }
}
