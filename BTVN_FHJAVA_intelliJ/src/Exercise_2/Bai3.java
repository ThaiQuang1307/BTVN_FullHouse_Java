package Exercise_2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        int leng = str.length() - 1;
        int left = 0;
        int right = leng;

        boolean check = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)){
                check = false;
                break;
            }
            left++;
            right--;
        }

        if (check)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

        sc.close();
    }
}
