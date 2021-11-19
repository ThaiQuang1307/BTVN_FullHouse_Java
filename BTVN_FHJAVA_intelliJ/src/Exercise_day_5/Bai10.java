package Exercise_day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        10. Viết chương trình nhập vào 2 điểm A(x, y) và B(x, y) trong hệ trục tọa độ Oxy
//        sau đó in ra độ dài cạnh AB.
//        Input: A(1, 4), B(5, 1)
//        Output: 5

        System.out.println("---Nhập tọa độ 2 điểm A và B---");
        ArrayList<Double> A = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ A(x, y): ");
        nhapDiem(A);
        ArrayList<Double> B = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ B(x, y): ");
        nhapDiem(B);

        System.out.println("AB = " + Math.sqrt(Math.pow(A.get(0) - B.get(0), 2) + Math.pow(A.get(1) - B.get(1), 2)));
        sc.close();
    }

    public static void nhapDiem(ArrayList diem){
        System.out.print("\tx = ");
        Double x = sc.nextDouble();
        System.out.print("\ty = ");
        Double y = sc.nextDouble();
        diem.add(x);
        diem.add(y);
    }
}
