package Exercise_2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cau: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s\\s+", " ").strip();
        str = str.toLowerCase();

        String[] arr = str.split(" ");
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            String temp = "";
            temp += Character.toUpperCase(arr[i].charAt(0));
            if (arr[i].length() > 1) temp += arr[i].substring(1);
            output += temp;
            if (i < arr.length-1) output+= " ";
        }

        System.out.println("Output:" + output);
        sc.close();
    }
}
