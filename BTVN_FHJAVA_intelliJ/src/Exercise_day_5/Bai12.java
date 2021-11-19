package Exercise_day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        12. Viết chương trình nhập vào 3 điểm A(x, y), B(x, y) và C(x, y)
//        trong hệ trục tọa độ Oxy sau đó in ra Chu vi và Diện tích tam giác ABC.
//        Input: A(1, 4), B(5, 1), C(1, 1)
//        Output: 12, 6

        System.out.println("--- Nhập tọa độ 3 điểm A, B và C ---");
        ArrayList<Double> A = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ A(x, y): ");
        nhapDiem(A);
        ArrayList<Double> B = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ B(x, y): ");
        nhapDiem(B);
        ArrayList<Double> C = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ C(x, y): ");
        nhapDiem(C);

        Double AB = Math.sqrt(Math.pow(A.get(0) - B.get(0), 2) + Math.pow(A.get(1) - B.get(1), 2));
        Double BC = Math.sqrt(Math.pow(B.get(0) - C.get(0), 2) + Math.pow(B.get(1) - C.get(1), 2));
        Double CA = Math.sqrt(Math.pow(C.get(0) - A.get(0), 2) + Math.pow(C.get(1) - A.get(1), 2));

        System.out.println("Chu vi: " + chuVi(AB, BC, CA));
        System.out.println("Diện tích: " + dienTich(AB, BC, CA));

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

    public static Double chuVi(Double a, Double b, Double c){
        return a + b + c;
    }

    public static Double dienTich(Double a, Double b, Double c){
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
