public class Main {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.nhap("1651060685", "Nguyen Van Huan", 20,
                true, "Hai Duong","0123456789",9.0f);
        sv.hoc();
        sv.lamBai();
        sv.thi();
        sv.inThongTin();

        NhanVien nv = new NhanVien();
        nv.nhap("NV0001", "Nguyen Van Huan",20,true,"Hai Duong",
                "Lap trinh", 20000000,"Quan Ly");
        nv.inThongTin();
    }
}
