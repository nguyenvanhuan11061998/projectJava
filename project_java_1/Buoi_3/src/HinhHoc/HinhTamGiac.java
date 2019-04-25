package HinhHoc;

public class HinhTamGiac extends HinhHoc{

    float canhA;
    float canhB;
    float canhC;

    public HinhTamGiac(String ten, float canhA, float canhB, float canhC) {
        super(ten);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    @Override
    void inThongTin() {
        super.inThongTin();
    }

    @Override
    void chuVi() {
        float chuvi = canhA+canhB+canhC;
        System.out.println("Chu vi tam giac: "+chuvi);
    }

    @Override
    void dienTich() {
        float chuvi = (canhA+canhB+canhC)/2;
        float dienTich = chuvi * (chuvi -canhA)*(chuvi - canhB)*(chuvi - canhC);
        dienTich = (float) Math.sqrt(dienTich);
        System.out.println("Dien tich la: "+ dienTich);
    }
}
