package Exercise_3;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n){
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
}
