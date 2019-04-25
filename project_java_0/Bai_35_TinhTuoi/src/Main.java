import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String a;
        int b, c, d;
        System.out.println(" Nhap ho ten: ");
        a = sc.nextLine();
        System.out.println("nhap vao ngay thang nam sinh: ");
        System.out.println("ngay: ");
        b = sc.nextInt();
        System.out.println("Thang : ");
        c = sc.nextInt();
        System.out.println("Nam: ");
        d = sc.nextInt();
        System.out.println("Ngay sinh : "+b+"/"+c+"/"+d);
        TinhTuoi TT = new TinhTuoi();
        TT.tinhTuoi(d);
    }
}
