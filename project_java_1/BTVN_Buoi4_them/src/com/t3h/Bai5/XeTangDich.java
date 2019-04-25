package com.t3h.Bai5;

public class XeTangDich extends  XeTang {
    private String loaiXeTang;

    public String getLoaiXeTang() {
        return loaiXeTang;
    }

    public void setLoaiXeTang(String loaiXeTang) {
        this.loaiXeTang = loaiXeTang;
    }

    public XeTangDich(String tocDo, Dan dan, String loaiXeTang) {
        super(tocDo, dan);
        setLoaiXeTang(loaiXeTang);
    }

    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("    loai xe tang "+getLoaiXeTang());
    }

    @Override
    void dichuyen() {
        System.out.println("    di chuyen ");
    }

    @Override
    void ban() {
        System.out.println("    xe tang dich ban ");
    }

    public void kiemTraTrungDan(){
        System.out.println("    Trung dan");
    }

    public void phaHuyBot(){
        System.out.println("    pha huy bot ");
    }
}
