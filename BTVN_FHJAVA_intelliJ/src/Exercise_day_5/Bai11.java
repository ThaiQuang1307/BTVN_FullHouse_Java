package Exercise_day_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        11. Viết chương trình nhập vào 2 điểm A(x, y) và B(x, y) trong hệ trục tọa độ Oxy
//        sau đó in ra phương trình đường thẳng AB
//        (hướng dẫn: dùng công thức tính hệ số góc, phương trình AB có dạng: y = ax + b trong đó a = (yA - yB)/(xB - xA)
//        từ đó tính được b bằng cách thay 1 trong 2 điểm A và B vào phương trình).
//        Input: A(2, 4), B(1, 5)
//        Output: y = -1x + 6

        System.out.println("---Nhập tọa độ 2 điểm A và B---");
        ArrayList<Double> A = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ A(x, y): ");
        nhapDiem(A);
        ArrayList<Double> B = new ArrayList<Double>();
        System.out.println("\tNhập tọa độ B(x, y): ");
        nhapDiem(B);

//        duongThangAB: y = ax + b
        Double a, b;

        if (A.get(0) == B.get(0)){
            System.out.println("Phương trình AB: y = " + A.get(0));
        }else if (A.get(1) == B.get(1)){
            System.out.println("Phương trình AB: y = " + A.get(1));
        }else {
            a = (A.get(1) - B.get(1)) / (A.get(0) - B.get(0));
            b = A.get(1) - a * A.get(0);
            System.out.println("Phương trình AB: y = " + a +"x + " + b);
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
