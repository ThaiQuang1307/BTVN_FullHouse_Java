package Exercise_2;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0){
            sum += n%10;
            n/=10;
        }
        System.out.print("\nOutput: " + sum);
        sc.close();
    }
}
