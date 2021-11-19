package Buoi03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // phép toán + - * / %
        // lưu ý: lấy 1 sô int tương tác với 1 số int -> số int
        // lưu ý: lấy 1 sô int tương tác với 1 số thực -> số thực
//        int a = 9;
//        int b = 13;
//        double c = 2.0;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);


        // mảng: có 3 cách tạo
//        cách 1:
//        int[] arr = new int[3]; // arr[0]. arr[1], arr[2]
//        arr[0] = 10;
//        arr[1] = 100;
//        arr[2] = 1000;
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(Arrays.toString(arr));

        //cach 2:
//        int[] arr = new int[]{4,2,5,1,2};
//        System.out.println(arr[2]);

//        String[] arr = new String[]{"trinh", "thai", "quang"};
//        System.out.println(Arrays.toString(arr));

        //cach 3
//        int[] arr = {3,2,1,4,5,1,2,3};
//        System.out.println(arr[3]);
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("Size cua mang: " + arr.length);

        // mang 2 chiều: 3 cach tao mang
        //cach 1:
//        int[][] arr = new int[2][];
//        arr[0] = new int[] {1,2,3};
//        arr[1] = new int[] {1,2,3,4,5,6};
//        System.out.println(arr[0][2]);
//        System.out.println(arr[1][3]);
//        System.out.println(Arrays.toString(arr[1]));

        //cach 2:
//        int[][] arr = new int[][]{{1,2,3},{4,5,6,7}};
//        System.out.println(arr[0][1]);
//        System.out.println(arr[1][3]);

        // cach 3:
//        int[][] arr = {{1,2,3},{4,5,6,7}};
//        System.out.println(arr[0][1]);
//        System.out.println(arr[1][3]);

        // địa chỉ
        //arr1 -> {1,2,3,4,5} <- arr2
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = arr1;

//        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
//        System.out.println(arr2[3]);
//        arr2[0] = 111;
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(System.identityHashCode(arr1));
//        System.out.println(System.identityHashCode(arr2));
//        int a = 10;
//        int b= a;
//        b = 6;
//        System.out.println(a+ " " + b);

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(100);
//        arr.add(50);
//        arr.add(1);
//        System.out.println(arr);
//        System.out.println(arr.get(1));
//        System.out.println(arr.isEmpty());
//        System.out.println(arr.contains(-1));
//        arr.remove(1);
//        System.out.println(arr);
//        System.out.println(arr.size());
//        arr.set(0, -1);
//        System.out.println(arr);

//        ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
//        ArrayList<String> arr1 = new ArrayList<String>();
//        arr1.add("trinh");
//        arr1.add("quang");
//
//        ArrayList<String> arr2 = new ArrayList<String>();
//        arr2.add("le");
//        arr2.add("thanh");
//        arr.add(arr1);
//        arr.add(arr2);
//
//        System.out.println(arr);
//        System.out.println(arr.get(1).get(1));

    }
}
