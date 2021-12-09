package Exercise_2;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check = true;
        if (n > 2){
            for (int i = 2; i < n; i++){
                if ((arr[i] - arr[i-1]) * (arr[i-1] - arr[i-2]) <= 0){
                    check = false;
                    System.out.println("False");
                    break;
                }
            }
        }
        if (check) System.out.println("True");
        sc.close();
    }
}
