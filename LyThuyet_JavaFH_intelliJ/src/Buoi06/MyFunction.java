package Buoi06;

public class MyFunction {
    static int add(int a, int b){
        // ko nên sử dụng câu lệnh print ở trong hàm trả về
        return a + b;
    }

    static int minus(int a, int b){
        return a - b;
    }

    static int time(int a, int b){
        return a*b;
    }

    static double div(int a, int b){
        return 1.0*a/b;
    }

    static int sum(int ...args){
        int sum = 0;
        for (int i :
                args) {
            sum += i;
        }
        return sum;
    }

    static void show(int[] arr){
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
    }
}
