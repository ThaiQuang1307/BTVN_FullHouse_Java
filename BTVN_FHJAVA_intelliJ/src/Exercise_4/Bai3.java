package Exercise_4;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println(LCM(4,24,16,8));
    }

    static int LCM(int ...args){
        int outPut = args[0];
        for (int i = 1; i < args.length-1; i++) {
            outPut = lcm(outPut, args[i]);
        }
        return outPut;
    }

    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }

    static int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
