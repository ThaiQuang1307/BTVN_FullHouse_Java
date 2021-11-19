package Exercise_day_5;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
//        9. Viết chương trình nhập vào 2 số a và b sau đó
//        in ra phần dư của a chia cho b(không dùng toán tử %).
//                  Input: a = 5, b = 2
//                  Output: 1

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào cặp số (a, b) với điều kiện b > 0: ");
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();

        do {
            if (b <= 0){
                System.out.println("Nhập lại b > 0: ");
                b = sc.nextInt();
            }
        }while (b <= 0);

        System.out.println(a + " chia " + b + " dư " + (a - (a/b)*b));
        sc.close();
    }
}
