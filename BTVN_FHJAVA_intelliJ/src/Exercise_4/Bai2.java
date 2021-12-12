package Exercise_4;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println(GCD(4,24,16,8));
    }

    static int GCD(int ...args){
        int outPut = args[0];
        for (int i = 1; i < args.length-1; i++) {
            outPut = gcd(outPut, args[i]);
        }
        return outPut;
    }

    static int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
