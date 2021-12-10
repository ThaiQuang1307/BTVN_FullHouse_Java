package Exercise_3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) throws MyException{
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            System.out.println("GCD(" + a + ", " + b + ") = " + OutPut(a, b));
        }catch (MyException e){
            System.out.println("either input cannot be 0");
        }
    }

    static int OutPut(int a, int b) throws MyException{
        if (a == 0 || b == 0){
            throw new MyException("either input cannot be 0");
        }else {
            return GCD(a, b);
        }
    }

    static int GCD(int a, int b) {
        if (a == 0) return b;
        return GCD(b % a, a);
    }
}


class MyException extends Exception{
    public MyException(String string) {
        super(string);
    }
}
