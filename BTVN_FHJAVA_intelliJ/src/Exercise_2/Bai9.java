package Exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter snake case string: ");
        String s = sc.nextLine();
        String[] str = s.split("_");
        String output = "";
        for (int i = 0; i < str.length; i++) {
            String temp = "";
            temp += Character.toUpperCase(str[i].charAt(0));
            if (str[i].length() > 1) temp += str[i].substring(1);
            output += temp;
        }
        System.out.println("Ouput: " + output);
        sc.close();
    }
}
