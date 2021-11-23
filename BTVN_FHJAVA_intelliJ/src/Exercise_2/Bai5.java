package Exercise_2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("\nb = ");
        int b = sc.nextInt();

        int start;
        int end;

        if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
            start = a;
        else
            start = (a / 4) * 4 + (4 - a % 4);
        System.out.print("\nOutput: " + start + "  ");

        end = start + 4;
        while (end <= b){
            System.out.print(end + "  ");
            end += 4;
        }
        sc.close();
    }
}
