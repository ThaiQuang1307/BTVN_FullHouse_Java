package Exercise_day_5;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        2. Viết chương trình nhập vào 2 số a và b sau đó so sánh a và b,
//        nếu a > b thì in ra “a > b”, a < b thì in ra “a < b”, a = b thì in ra “a = b”.
//        Input: 4, 2
//        Output: 4 > 2

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a = ");
        double a = sc.nextDouble();
        System.out.println("Nhap b = ");
        double b = sc.nextDouble();

        if (a > b){
            System.out.println(" a > b");
        }else if (a < b){
            System.out.println(" a < b");
        }else {
            System.out.println(" a = b");
        }

        sc.close();
    }
}
