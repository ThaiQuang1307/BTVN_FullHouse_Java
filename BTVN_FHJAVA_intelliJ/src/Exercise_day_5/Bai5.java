package Exercise_day_5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
//        5. Viết chương trình nhập vào 1 kí tự chữ cái từ a-z hoặc A-Z
//        sau đó in ra kí tự tiếp theo của kí tự đó trong bảng chữ cái,
//        giả sử nhập vào ‘z’ thì in ra màn hình là ‘a’.
//        Input: c
//        Output: d

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ki tu: ");
        char kitu = sc.nextLine().charAt(0);

        System.out.print("\nOutput: ");
        if (kitu == 'z'){
            System.out.print("a");
        }else if (kitu == 'Z'){
            System.out.print("A");
        }else {
            System.out.println((char) (kitu+1));
        }

        sc.close();
    }
}
