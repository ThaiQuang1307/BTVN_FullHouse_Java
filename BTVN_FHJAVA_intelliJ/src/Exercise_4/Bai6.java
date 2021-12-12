package Exercise_4;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println(productOfSum("42415"));
    }

    static int productOfSum(String s){
        int sum1 = 0; // tổng các chữ số của chuỗi
        for (int i = 0; i < s.length(); i++) {
            sum1 += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        // tích các chữ số của sum1
        int outPut = 1;
        while (sum1 > 0){
            outPut *= sum1 % 10;
            sum1 /= 10;
        }
        return outPut;
    }
}
