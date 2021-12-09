package Exercise_2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter camel case string: ");
        String s = sc.nextLine();
        int leng = s.length();
        String output = "";

        for (int i = 0; i < leng; i++) {
            if (Character.isUpperCase(s.charAt(i))){
                output += "_" + Character.toLowerCase(s.charAt(i));
            }else {
                output += s.charAt(i);
            }
        }
        System.out.print("\nOutput: " + output);
        sc.close();
    }
}
