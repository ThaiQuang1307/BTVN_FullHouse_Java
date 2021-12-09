package Exercise_3;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(100));
    }

    static boolean checkLeapYear(int n){
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))
            return true;
        else
            return false;
    }
}
