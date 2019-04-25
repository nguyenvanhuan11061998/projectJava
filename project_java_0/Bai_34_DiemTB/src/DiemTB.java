public class DiemTB {
    void KiemTra (double a, double b, double c){
        double TB;
        TB = (double)(a+b+c)/3;
        if(TB < 4){
            System.out.println(" hoc luc yeu");
        }else if((TB >= 4)&&(TB < 5.5)){
            System.out.println(" hoc luc trung binh");
        }else if((TB >= 5.5)&&(TB < 7)){
            System.out.println(" hoc luc kha");
        }else if((TB >= 7)&&(TB < 8.5)){
            System.out.println(" hoc luc gioi");
        }else if(TB >= 8.5){
            System.out.println(" hoc luc xuat sac");
        }
    }
}
