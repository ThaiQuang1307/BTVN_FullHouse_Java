package Exercise_day_5;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
//        7. Viết chương trình nhập vào số n
//        sau đó đổi từ n°C sang °F và
//        n°F sang °C và in 2 kết quả đó ra màn hình.
//        Input: 2
//        Output: 2°C = 35.6°F, 2°F = -16.668°C

        // F = 9/5 x C + 32 = 1.8 x C + 32
        // C = 5/9 x ( F – 32 ) = ( F – 32 ) / 1.8.

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số độ: ");
        double nhietDo = sc.nextDouble();

        // chuyển đổi
        double f = 1.8 * nhietDo + 32;
        double c = (nhietDo - 32) / 1.8;

        System.out.printf("\n %.3fC = %.3fF", nhietDo, f);
        System.out.printf("\n %.3fF = %.3fC", nhietDo, c);

        sc.close();
    }
}
