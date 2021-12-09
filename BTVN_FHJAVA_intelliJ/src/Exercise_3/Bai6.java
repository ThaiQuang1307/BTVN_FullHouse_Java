package Exercise_3;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println(checkPrime(5));
    }

    static boolean checkPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
}
