package Exercise_day_5;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
//        4. Viết chương trình nhập vào 1 kí tự sau đó in ra
//        “This is an upper case” nếu kí tự đó là chữ cái in hoa,
//        nếu là chữ cái viết thường thì in ra “This is an lower case” và
//        nếu kí tự đó không phải chữ cái thì in ra “This is not an alphabetic”.
//        Input: D
//        Output: This is an upper case

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao 1 ki tu: ");
        char kitu = sc.nextLine().charAt(0);

        if (kitu >= 65 && kitu <= 90){
            System.out.println("This is an upper case");
        }else if (kitu >= 97 && kitu <= 122){
            System.out.println("This is an lower case");
        }else {
            System.out.println("This is not an alphabetic");
        }
        int i = 4;
        int j = -i;
        System.out.println(j);
        sc.close();
    }
}
