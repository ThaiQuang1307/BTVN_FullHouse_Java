package Buoi06;

public class Main {
    public static void main(String[] args) {

//        // tên biến dạng  camel
//        int bienCuaToi;
//        // tên biến dạng snake
//        String name_of_student;
//        // ten hang so
//        String NAME_OF_STUDENT

        // lenh break
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.print(j + " ");
//                if (j ==  5) break;
//            }
//            System.out.println();
//            if (i == 5) break;
//        }

        // lenh continue
//        for (int i = 0; i < 10; i++) {
//            System.out.println("trinh thai quang");
//            if (i % 2 == 0){
//                continue;
//            }
//            System.out.println(i);
//            System.out.println();
//        }

        // bố trí điều kiện
//        int[] arr = {100,200,300};
//        int i = 0;
//
//        // dung
//        while (i < arr.length && arr[i] > 0){
//            System.out.println(i);
//            i++;
//        }
//
//        // sai
//        while (arr[i] > 0 && i < arr.length){
//            System.out.println(i);
//            i++;
//        }

        // hàm
//        hello();
//        System.out.println(add_1(10,90));
//        System.out.println(add_2(1,2,3));

//        System.out.println(add(1,9));
//        System.out.println(add(2,3,4));

//        int[] arr = {1,2,3,4,5,6,76,7};
//        print(arr);
//        print(1,2,3,4,5,6,7,8,9);

//        System.out.println(add(1,2,3,4,5,6,7,8,9));

        // toán tử 3 ngôi
//        int a = 10;
//        int b = 11;
//
//        // điều kiện ? nếu True : nếu False
//        String name = a > b ? "trinh thai quang" : "Null";
//        System.out.println(name);
//        if (a > b){
//            name = "trinh thai quang";
//        }else {
//            name = "Null";
//        }

//        System.out.println(MyFunction.add(10,20));
//        System.out.println(MyFunction.minus(10,20));
//        System.out.println(MyFunction.time(10,20));
//        System.out.println(MyFunction.div(10,20));
//        System.out.println(MyFunction.sum(10,20,2,1,1,1,1,1,2));
//        int[] arr = {11,1,1,1,2,12,34,324,24,35,567};
//        MyFunction.show(arr);
    }



//    static void hello(){
//        System.out.println("Hello world");
//    }
//
//    static int add(int a, int b){
//        return a+b;
//    }
//
//    static int add(int a, int b, int c){
//        return a+b;
//    }
//    static int add_2(int a , int b, int c){
//        return a+b+c;
//    }

//    static void print(int ...args){
//        for (int i :
//                args) {
//            System.out.print(i + " ");
//        }
//    }

//    static void print(int[] arr) {
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//    }

//    static double add(double ...list){
//        // double[] list = {1,2,3};
//        double sum = 0;
//        for (double i :
//                list) {
//            sum += i;
//        }
//        return sum;
//    }

    static int max3(int a, int b, int c){
        int max2 = a > b ? a : b;
        return max2 > c ? max2 : c;
    }
}
