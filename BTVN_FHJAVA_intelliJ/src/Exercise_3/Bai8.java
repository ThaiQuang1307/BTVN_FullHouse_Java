package Exercise_3;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNum(6));
    }

    static boolean checkPerfectNum(int n){
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            sum += i;
            sum += n / i;
        }

        if (Math.sqrt(n) * Math.sqrt(n) == n){
            sum -= Math.sqrt(n);
        }

        if (sum == 2 * n) return true;
        else return false;
    }

}
