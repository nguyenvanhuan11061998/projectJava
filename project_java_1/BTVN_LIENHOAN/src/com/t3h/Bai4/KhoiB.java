package com.t3h.Bai4;

public class KhoiB extends ThiSinh{
    private String diemToan;
    private String diemHoa;
    private String diemSinh;

    public KhoiB(String sBD, String hoTen, String diaChi, String uuTien, String diemToan, String diemHoa, String diemSinh) {
        super(sBD, hoTen, diaChi, uuTien);
        this.diemToan = diemToan;
        this.diemHoa = diemHoa;
        this.diemSinh = diemSinh;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("diem Toan: "+diemToan);
        System.out.println("diem Hoa: "+diemHoa );
        System.out.println(" diem Sinh : "+diemSinh);
    }
}
