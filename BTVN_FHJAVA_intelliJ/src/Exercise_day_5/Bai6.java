package Exercise_day_5;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        6. Viết chương trình nhập vào 3 số a, b, c và
//        in ra số lớn nhất trong 3 số.
//                Input: 3, 4, 3
//        Output: 4

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao 3 so a, b, c: ");
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();

        System.out.println("Output: ");
        System.out.println(Math.max(Math.max(a, b), c));
//        double max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//        System.out.println(max);

        sc.close();
    }



}
