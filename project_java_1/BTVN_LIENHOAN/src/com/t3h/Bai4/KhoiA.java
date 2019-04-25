package com.t3h.Bai4;

public class KhoiA extends ThiSinh {
    private String diemToan;
    private String diemLy;
    private String diemHoa;

    public KhoiA(String sBD, String hoTen, String diaChi, String uuTien, String diemToan, String diemLy, String diemHoa) {
        super(sBD, hoTen, diaChi, uuTien);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println(" diem toan: "+diemToan);
        System.out.println(" diem Ly: "+diemLy);
        System.out.println(" diem Hoa: "+diemHoa);
    }
}
