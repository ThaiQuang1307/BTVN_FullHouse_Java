package Exercise_3;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        try {
            System.out.println("LCM(" + a + ", " + b + ") = " + OutPut(a, b));
        } catch (MyException2 e) {
            System.out.println("either input cannot be 0");
        }
    }

    static int OutPut(int a, int b) throws MyException2{
        if (a == 0 || b == 0){
            throw new MyException2("either input cannot be 0");
        }else {
            return LCM(a, b);
        }
    }

    static int LCM(int a, int b){
        return a * b / GCD(a, b);
    }

    static int GCD(int a, int b){
        if (a == 0) return b;
        return GCD(b % a, a);
    }
}

class MyException2 extends Exception{
    public MyException2(String string) {
        super(string);
    }
}
