package Exercise_day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai15 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        15. Mở rộng của câu 14, hãy kiểm tra 3 điểm A, B, C có tạo thành tam giác hay không
//        nếu không thì in ra “Invalid” nếu tạo thành tam giác thì làm như bài 14.
//        Input: O(0, 0) R = 1, A(1, 1), B(3, 3), C(5, 5)
//        Output: Invalid


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

        Double AB = Math.sqrt(Math.pow(A.get(0) - B.get(0), 2) + Math.pow(A.get(1) - B.get(1), 2));
        System.out.println(OA);
        Double BC = Math.sqrt(Math.pow(C.get(0) - B.get(0), 2) + Math.pow(C.get(1) - B.get(1), 2));
        System.out.println(OB);
        Double CA = Math.sqrt(Math.pow(A.get(0) - C.get(0), 2) + Math.pow(A.get(1) - C.get(1), 2));
        System.out.println(OC);

        if (AB < BC + CA && BC < AB + CA && CA < AB + BC){
            if (OA == R && OB == R && OC == R){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }else {
            System.out.println("Invalid");
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
