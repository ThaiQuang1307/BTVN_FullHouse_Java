package Exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap phan so: ");
        String phanSo = sc.nextLine();
        String[] arr = phanSo.split("/");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        a /= UCLN(a, b);
        b /= UCLN(a, b);

        System.out.println("Output: " + a + "/" + b);
        sc.close();
    }
    public static int UCLN(int a, int b){
        if (b == 0) return a;
        if (a % b == 0) return b;
        return UCLN(b, a%b);
    }
}
