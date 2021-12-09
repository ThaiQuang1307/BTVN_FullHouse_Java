package Exercise_3;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println(checkMostPalindrome("abcbba"));
    }

    static boolean checkMostPalindrome(String s){
        int n = s.length();
        int Count = 0;
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)){
                Count++;
            }
            if (Count > 1) break;
        }
        if (Count == 1) return true;
        else return false;
    }
}
