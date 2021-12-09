package Exercise_3;

public class Bai12 {
    public static void main(String[] args) {
        System.out.println(triangleNumber(10));
    }

    static int triangleNumber(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
