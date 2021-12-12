package Exercise_4;

public class Bai10 {
    public static void main(String[] args) {
        listPrime(1, 10);
    }

    static void listPrime(int a, int b){
        for (int i = a+1; i < b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
}
