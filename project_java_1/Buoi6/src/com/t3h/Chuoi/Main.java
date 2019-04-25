package com.t3h.Chuoi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello world, hello Viet Nam";
//        int length = str.length();                   // lấy ra độ dài chuỗi str
//        System.out.println(length);
//        char c = str.charAt(4);                    // lấy phần tử có vị trí là 4
//        System.out.println(c);
//        int index = str.indexOf("l");              //lấy ra vị trí đầu tiên có phần tử "l"
//        System.out.println(index);
//        int lastIndexOf = str.lastIndexOf("l");    //lấy ra vị trí cuối cùng có phần tử "l"
//        System.out.println(lastIndexOf);
//        int secondeIndex = str.indexOf("l",index+1); // lấy ra vị trí phần tử "l" bắt đầu từ vị trí index+1
//        System.out.println(secondeIndex);
//
//        for (int i = 0; i < str.length(); i++) {
//            char check = str.charAt(i);
//            if(check == 'l'){
//                System.out.print(i+"\t");
//            }
//        }

//        int indexx = str.indexOf("l");
//        while (indexx != -1){
//            System.out.print(indexx+" \t");
//            indexx = str.indexOf("l",indexx+1);
//        }

//        System.out.println();
//        String str1 = str.substring(2);             //cắt, lấy ra chuỗi có vị trí bắt đầu từ 2
//        System.out.println(str1);
//        String stl1 = str.substring(2,5);           //cắt, lấy ra chuỗi có vị trí bắt đầu từ 2 đến 5
//        System.out.println(stl1);
//        stl1 = stl1.toUpperCase();                  //viết hoa các phần tử trong chuỗi
//        System.out.println(stl1);
//        stl1 = stl1.toLowerCase();                  //viết thường các phần tử trong chuỗi
//        System.out.println(stl1);
//        stl1 = stl1.replaceFirst("l","L");      //thay thế phần tử "l" đầu tiên trong chuỗi thành "L"
//        System.out.println(stl1);


//        Main main = new Main();
//        main.upperCase(str);


//        String str2 = str;
//        boolean equals = str.equals(str2);              //so sánh chuỗi str với str2( có phân biệt hoa thường)
//        System.out.println(equals);
//        equals = str.equalsIgnoreCase(str2);            //so sánh chuỗi str vói str2( không phân biệt hoa thường)
//        System.out.println(equals);

//        int ascii = str.codePointAt(0);                   //lấy ra mã ascii của phần tử ở vị trí 0
//        System.out.println(ascii);
//        System.out.println((char)ascii);                  //lấy ra ký tự có mã ascii là ascii
//
//        String s1 = "ab1c";
//        String s2 = "abc";
//        int compare = s1.compareTo(s2);                   //lấy mã ascii của chuỗi s2 - s1(khác nhau ở phần tử nào thì dừng lại ở đó
//        System.out.println(compare);


//        String s3 = "       hello android       1";
//        System.out.println(s3);
//        s3 = s3.trim();                                 //loại bỏ lý tự space tở đầu và cuối chuỗi
//        System.out.println(s3);


//        String[] arr = str.split(" ");                //cắt chuỗi tại vị trí có phần tử space
//        for (String s:arr) {
//            System.out.print(s+" ; ");
//        }

//        char [] chars = str.toCharArray();      //trả về mảng kí tự của chuỗi
//        byte[] b = str.getBytes();


        System.out.println("======================================");
        StringBuilder builder = new StringBuilder("");
        builder.append("đọc ngược từ cuối lên đầu nhé )):");                //thêm vào cuối chuỗi một xâu kí tự
        builder.insert(2,"ABC");                //thêm vào vị trí 2 một xâu ký tự
        builder.delete(2,5);                               //xóa các ký tự từ vị trí 2 đến 5
        builder.reverse();                                 //đảo ngược xâu ký tự
        System.out.println(builder.toString());
    }
        private void upperCase (String str){
            int index = str.indexOf(" ");
            while (index != -1) {
                String s = str.substring(index, index + 2);
                String s1 = s.toUpperCase();
                str = str.replaceFirst(s, s1);
                index = str.indexOf(" ", index + 1);
            }
            System.out.println(str);
        }
}
