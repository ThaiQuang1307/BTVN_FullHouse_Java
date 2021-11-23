package Exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);

        boolean[] check = new boolean[arr[arr.length-1]];
        for (int i = 0; i < n-1; i++) {
            check[arr[i]] = true;
        }

        System.out.print("\nOutput: ");
        for (int i = 1; i < check.length; i++) {
            if (!check[i]){
                System.out.print(i + " ");
            }
        }
    }
}
