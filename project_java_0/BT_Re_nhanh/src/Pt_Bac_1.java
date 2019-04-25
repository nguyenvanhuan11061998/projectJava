import java.sql.SQLOutput;
import java.util.Scanner;

public class Pt_Bac_1 {
    void GiaiPTB1(double a, double b){
        System.out.println(" Phuong trinh bac 1");
        if(a == 0){
            System.out.println(" Phuong trinh vo nghiem ");
        }else{
            System.out.println("Phuong trinh co nghiem la: "+ (-b/a));
        }
    }
    void GiaiPTB2(double a, double b, double c){
        double delta = b*b - 4*a*c;
        System.out.println(" phuong trinh bac hai");
        if(delta < 0 ){
            System.out.println("phuong trinh vo nghiem");
        }else if(delta == 0){
            System.out.println("phuong trinh co nghiem kep: "+ (-b/(2*a)));
        }else{
            System.out.println("phuong trinh co hai nghiem phan biet");
            System.out.println("nghiem 1: "+((-b + Math.sqrt(delta)) / (2*a)));
            System.out.println("nghiem 2: "+((-b - Math.sqrt(delta)) / (2*a)));
        }
    }
}
