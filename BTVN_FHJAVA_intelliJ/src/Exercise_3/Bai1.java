package Exercise_3;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println(tich(3,2,5,1,2));
    }

    static double tich(double ...args){
        double tich = 1;
        for (double i : args) {
            tich *= i;
        }
        return tich;
    }
}
