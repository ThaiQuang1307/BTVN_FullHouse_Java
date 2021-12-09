package Exercise_2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("UCLN(" + a + ", " + b + ") = " + UCLN(a, b));
        sc.close();
    }

    public static int UCLN(int a, int b){
        if (b == 0) return a;
//        if (a % b == 0) return b;
        return UCLN(b, a%b);
    }
}
