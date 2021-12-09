package Exercise_3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.println("GCD(" + a + ", " + b + ") = " + GCD(a,b));
    }

    static int GCD(int a, int b){
        if (a == 0) return b;
        return GCD(b % a, a);
    }
}
