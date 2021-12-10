package Buoi09;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) /*throws MyError*/ {
        try {
//            System.out.println(div(3, 4));
//            int[] arr = {1, 2, 3, 4};
//            System.out.println(arr[10]);
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(a*100);
            sc.close();
        } catch (Exception e) {
            System.out.println("Dau vao khong hop le");
        } finally {
            System.out.println("Ket thuc chuong trinh");
        }
//        System.out.println(div(3, 0));
        // ngoại lệ
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextLine(); //check exception
//        int b = sc.nextInt(); // uncheck ( trong quá trình chạy input ko phải int)

//        String myString;
//        try {
//            int[] arr = {1,2,3};
////            int a = sc.nextInt();
////            System.out.println(a);
//            System.out.println(arr[4]);
//            System.out.println(arr[2]);
//
//        }catch (InputMismatchException e){
//            System.out.println("Nhap sai kieu du lieu");
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("Vuot qua pham vi");
//        }finally {
//            System.out.println("Hoan thanh chuong trinh");
//        }


//        sc.close();
    }

    static double div(int a, int b) throws MyError {
        if (b == 0) {
            throw new MyError("Khong the chia cho 0");
        } else {
            return (double) a / b;
        }
    }
}
