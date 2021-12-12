package Exercise_4;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println(memeNumber(14827, 4234));
    }

    static String memeNumber(int a, int b){
        String outPut = "";
        while (a > 0 || b > 0){
            int temp1 = a % 10;
            int temp2 = b % 10;
            int sum = temp1 + temp2;
            outPut = sum + outPut;
            a /= 10;
            b /= 10;
            if (sum > 10){
                a++;
            }
        }
        return outPut;
    }
}
