package Exercise_3;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println(checkAlphabet("ledaotanthanh77"));
    }

    static boolean checkAlphabet(String s){
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isAlphabetic(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
