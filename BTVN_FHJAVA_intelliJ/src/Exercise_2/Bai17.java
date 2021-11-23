package Exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] check = new boolean[n];

        System.out.print("\nOutput: ");
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0){
//                if (arr[0] != arr[1]) System.out.print(arr[0] + "  ");
//            }else if (i == arr.length-1){
//                if (arr[i] != arr[i-1]) System.out.print(arr[i] + "\n");
//            }else {
//                if (arr[i] != arr[i-1] && arr[i] != arr[i+1]) System.out.print(arr[i] + "  ");
//            }
//        }
        for (int i = 0; i < n; i++) {
            if(!check[i]) {
                int cnt = 1;
                for (int j = i+1; j < n; j++) {
                    if (arr[j]==arr[i]) {
                        check[j] = true;
                        cnt++;
                    }
                }
                if (cnt == 1){
                    System.out.print(arr[i] + "  ");
                }
            }
        }
        sc.close();
    }
}
