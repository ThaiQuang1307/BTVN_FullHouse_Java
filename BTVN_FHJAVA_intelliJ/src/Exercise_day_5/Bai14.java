package Exercise_day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        14. Viết chương trình nhập vào đường tròn tâm O(x, y) bán kính R và
//        3 điểm A(x, y), B(x, y) và C(x, y) sau đó in ra
//        True nếu tam giác ABC nằm trong hình tròn và False nếu không.
//                Input: O(0, 0) R = 1, A(1, 4), B(5, 1), C(1, 1)
//                Output: False

        System.out.println("--- Nhập tọa độ tâm O(x, y) và bán kính R---");
        ArrayList<Double> O = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ O(x, y): ");
        nhapDiem(O);
        System.out.println("\tNhập bán kính R = ");
        double R = sc.nextDouble();

        System.out.println("---Nhập tọa độ 3 điểm A, B và C ---");
        ArrayList<Double> A = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ A(x, y): ");
        nhapDiem(A);
        ArrayList<Double> B = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ B(x, y): ");
        nhapDiem(B);
        ArrayList<Double> C = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ C(x, y): ");
        nhapDiem(C);

        Double OA = Math.sqrt(Math.pow(O.get(0) - A.get(0), 2) + Math.pow(O.get(1) - A.get(1), 2));
        System.out.println(OA);
        Double OB = Math.sqrt(Math.pow(O.get(0) - B.get(0), 2) + Math.pow(O.get(1) - B.get(1), 2));
        System.out.println(OB);
        Double OC = Math.sqrt(Math.pow(O.get(0) - C.get(0), 2) + Math.pow(O.get(1) - C.get(1), 2));
        System.out.println(OC);

        if (OA == R && OB == R && OC == R){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

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
