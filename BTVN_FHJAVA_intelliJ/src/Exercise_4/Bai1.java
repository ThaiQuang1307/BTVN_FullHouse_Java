package Exercise_4;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println(convertFromBinToDec("1101"));
    }

    static int convertFromBinToDec(String s){
        int n = s.length();
        int outPut = 0;
        for (int i = n-1; i >= 0; i--) {
            int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
            outPut += temp * Math.pow(2, n - 1 - i);
        }
        return outPut;
    }
}
