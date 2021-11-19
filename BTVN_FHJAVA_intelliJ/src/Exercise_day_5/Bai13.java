package Exercise_day_5;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
//        13. Viết chương trình nhập vào a, b, c của phương trình bậc 2 ax^2 + bx + c = 0
//        sau đó tìm nghiệm và in giá trị của nghiệm ra màn hình nếu phương trình vô nghiệm thì in ra “No solution”.
//        Input: 1, -2, 1
//        Output: x1 = x2 = 1

        System.out.println("--- Nhập vào phương trình bâc 2: ax^2 + bx + c = 0 (a khác 0) ---");
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        double a = sc.nextDouble();
        do {
            if (a <= 0){
                System.out.println("Nhập lại a khác 0: ");
                a = sc.nextDouble();
            }
        }while (a <= 0);
        System.out.println("b = ");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0){
            System.out.println("No solution");
        }else if (delta == 0){
            System.out.println("Output: x1 = x2 = " + (0 - b) / (2 * a));
        }else {
            double x1 = ((0 - b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((0 - b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("Output: x1 = " + x1);
            System.out.println("Output: x2 = " + x2);
        }

        sc.close();
    }
}
