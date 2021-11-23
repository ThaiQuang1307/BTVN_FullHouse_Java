package Exercise_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n1 = ");
        int n1 = sc.nextInt();
        double[] arr1 = new double[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextDouble();
        }

        System.out.print("\nNhap n2 = ");
        int n2 = sc.nextInt();
        double[] arr2 = new double[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextDouble();
        }

        System.out.print("\nNhap n3 = ");
        int n3 = sc.nextInt();
        double[] arr3 = new double[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextDouble();
        }


        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println("Output:");
        System.out.println("Max 1: " + arr1[arr1.length-1]);
        System.out.println("Max 2: " + arr2[arr2.length-1]);
        System.out.println("Max 3: " + arr3[arr3.length-1]);

        sc.close();
    }
}
