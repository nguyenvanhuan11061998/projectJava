package Bai2_QLChiTieu;

public class KhoanNo extends QuanLy{
    int soTienNo;
    String nguoiChuNo;
    String thoiHanNo;
    String ngayTra;
    int laiSuat;
    String lyDoNo;
    boolean xacNhanTra;

    public KhoanNo(int stt, String thoiGian, String diaDiem,
                   int soTienNo, String lyDoNo, String nguoiChuNo, String thoiHanNo,
                   int laiSuat,String ngayTra, boolean xacNhanTra) {
        super(stt, thoiGian, diaDiem);
        this.soTienNo = soTienNo;
        this.nguoiChuNo = nguoiChuNo;
        this.thoiHanNo = thoiHanNo;
        this.ngayTra = ngayTra;
        this.laiSuat = laiSuat;
        this.lyDoNo = lyDoNo;
        this.xacNhanTra = xacNhanTra;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
        System.out.println("so tien no: "+soTienNo);
        System.out.println("chu No: "+nguoiChuNo);
        System.out.println("thoi han no: "+thoiHanNo);
        System.out.println("ngay tra: "+ngayTra);
        System.out.println("lai xuat: "+laiSuat);
        System.out.println("ly do no: "+lyDoNo);
        String xn = xacNhanTra? "Da Tra":"Chua Tra";
        System.out.println("xac nhan: "+xn);
    }
}


