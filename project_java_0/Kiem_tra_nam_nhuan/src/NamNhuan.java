public class NamNhuan {
    void KiemTra(int a){
        if((a % 4 == 0) && (a % 100 != 0)){
            System.out.println("nam "+a+" la nam nhuan.");
        }else if((a % 4 == 0)&&(a % 100 == 0)){
            if(a % 400 == 0){
                System.out.println("nam "+a+" la nam nhuan.");
            }else{
                System.out.println("nam "+a+" khong la nam nhuan.");
            }
        }else{
            System.out.println("nam "+a+" khong la nam nhuan.");
        }
    }
}
