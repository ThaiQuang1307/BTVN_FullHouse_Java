package Exercise_day_5;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
//        8. Viết chương trình nhập vào 3 cạnh của tam giác sau đó
//        in ra Chu vi và Diện tích của tam giác đó
//        (hướng dẫn: dùng công thức hê-rông để tính Diện tích tam giác có độ dài 3 cạnh).
//        Input: 3, 4, 5
//        Output: 12, 6

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập độ dài 3 cạnh tam giac (a, b, c): ");
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();

        System.out.println("Chu vi: " + (a+b+c));
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Diện tích: " + s);

        sc.close();
    }
}
