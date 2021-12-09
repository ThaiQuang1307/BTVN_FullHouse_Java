package Exercise_3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = deleteDuplicate(arr);
        System.out.println("Output: " + Arrays.toString(arr));

    }

    static int[] deleteDuplicate(int ...arr){
        int n = arr.length;
        boolean[] check = new boolean[n];
        for (int i = 0; i < n; i++) {
            check[i] = true;
        }

        for (int i = 0; i < n; i++) {
            if (check[i]){
                for (int j = i+1; j < n; j++) {
                    if (arr[i] == arr[j])
                        check[j] = false;
                }
            }
        }

        int Count = 0; // đếm số lượng phần tử không trùng
        for (int i = 0; i < n; i++) {
            if (check[i]) Count++;
        }

        int[] outPut = new int[Count];
        int i = 0; // chỉ số của mảng output
        int j = 0; // chỉ số của
        while (i < Count){
            if (check[j]){
                outPut[i] = arr[j];
                i++;
            }
            j++;
        }

        arr = Arrays.copyOf(outPut, outPut.length);
        return arr;
    }
}
