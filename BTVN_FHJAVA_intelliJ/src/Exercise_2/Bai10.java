package Exercise_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNhap n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Output: " + arr[arr.length-1] + ", " + arr[0]);
        sc.close();
    }
}
