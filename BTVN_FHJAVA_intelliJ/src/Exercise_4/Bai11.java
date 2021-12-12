package Exercise_4;

public class Bai11 {
    public static void main(String[] args) {
        listPerfect(5,47);
    }

    static void listPerfect(int a, int b){
        for (int i = a; i <= b; i++) {
            if (isPerfect(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPerfect(int n){
        int sum = 0; // tổng các ước của n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                sum += i;
                sum += n / i;
            }
        }

        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            sum -= Math.sqrt(n);
        }
        return sum == 2 * n;
    }
}
