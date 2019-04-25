package com.t3h.Bai2;

public class ChuanHoa {
    public void chuoiBanDau(String chuoi){
        System.out.println("-======== Chuoi Nhap Vao =========-");
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.print(chuoi.charAt(i));
        }
    }
    public String xuLy(String chuoi){

        chuoi = chuoi.replace("--","-0-");
        chuoi = chuoi.replace("++","+0+");
        chuoi = chuoi.replace("-+","-");
        chuoi = chuoi.replace("+-","-");

        return chuoi;
    }

    public void inChuoi(String chuoi){
        String chuoi1 = xuLy(chuoi);
        for (int i = 0; i < chuoi1.length(); i++) {
            System.out.print(chuoi1.charAt(i));
        }
    }

    public String xuLyChuoi(String chuoi){
        String chuoi2 = xuLy(chuoi);
        char [] A = chuoi2.toCharArray();
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 48 || A[i] >57){
                A[i] = ' ';
            }
        }
        String chuoi3 = String.valueOf(A);
        return chuoi3;
    }

    public int kiemTra(char a){
        if(a == '+'){
            return 1;
        }else if(a == '-'){
            return 2;
        }
        return 2;
    }

    public void tinhTong(String chuoi) {
        int ketQua = 0;
        String chuoiSoSau = xuLyChuoi(chuoi);
        String chuoiSoDau = xuLy(chuoi);
        String[] arr = chuoiSoSau.split(" ");
        for (int i = 0; i < arr.length; i++){
            chuoiSoDau = chuoiSoDau.replace(arr[i],"");
            int kT = kiemTra(chuoiSoDau.charAt(0));
            if(kT == 1){
                ketQua = ketQua - Integer.parseInt(arr[i]);
            }else{
                ketQua = ketQua + Integer.parseInt(arr[i]);
            }
            chuoiSoDau = chuoiSoDau.substring(1,chuoiSoDau.length());
        }
        System.out.println(" ket qua: "+ketQua);
    }

}
