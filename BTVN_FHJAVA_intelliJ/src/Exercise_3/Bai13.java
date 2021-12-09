package Exercise_3;

public class Bai13 {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    static long fibonacci(int n){
        long[] fibo = new long[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }
}
