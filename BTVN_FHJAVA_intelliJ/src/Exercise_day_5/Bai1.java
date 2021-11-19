package Exercise_day_5;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
//        1. Viết chương trình nhập vào giờ cụ thể có dạng giờ:phút:giây sau đó đổi sang số giây.
//                  Input: 3:20:40
//                  Output: 12040
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập giờ: ");
        int gio = sc.nextInt();
        System.out.println("Nhập phút: ");
        int phut = sc.nextInt();
        System.out.println("Nhập giây: ");
        int giay = sc.nextInt();

        quyDoi(gio, phut, giay);
        sc.close();
    }

    public static void quyDoi(int gio, int phut, int giay){
        int giay1 = giay + phut * 60 + gio * 3600;
        System.out.printf("\n Số giây sau khi quy đổi từ %d:%d:%d là: %d", gio, phut, giay, giay1);
    }
}
