import java.lang.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiemTB DTB = new DiemTB();
        String a ;
        int b;
        System.out.println(" nhap ten sinh vien: ");
        a = sc.nextLine();
        System.out.println(" nhap ma sinh vien: ");
        b = sc.nextInt();
        System.out.println(" Sinh vien: "+a);
        System.out.println(" Ma sinh vien: "+b);
        DTB.KiemTra(6,7,8);
    }
}
