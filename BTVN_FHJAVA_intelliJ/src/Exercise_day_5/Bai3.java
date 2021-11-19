package Exercise_day_5;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
//        3. Viết chương trình nhập vào 2 số a, b và đổi giá trị của 2 số đó cho nhau sau đó in ra màn hình giá trị của a và b.
//        Input: a = 4, b = 1
//        Output: a = 1, b = 4

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        double a = sc.nextDouble();
        System.out.println("Nhap b = ");
        double b = sc.nextDouble();

        double temp = a;
        a = b;
        b = temp;

        System.out.println("Out put: a = " + a + ", b = " + b);
        sc.close();
    }
}
