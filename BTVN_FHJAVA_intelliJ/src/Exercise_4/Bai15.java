package Exercise_4;

import java.util.ArrayList;

public class Bai15 {
    public static void main(String[] args) {
        System.out.println(divFraction("4/2", "3/6"));
    }

    static String divFraction(String string1, String string2){
        String[] arr1 = string1.split("/");
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        for (String i : arr1) {
            arrayList1.add(Integer.parseInt(i));
        }

        String[] arr2 = string2.split("/");
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        for (String i : arr2) {
            arrayList2.add(Integer.parseInt(i));
        }

        int tuSo = arrayList1.get(0) * arrayList2.get(1);
        int mauSo = arrayList1.get(1) * arrayList2.get(0);
        int gcd = GCD(tuSo, mauSo);
        String outPut = "" + tuSo / gcd + "/" + mauSo / gcd;
        return  outPut;
    }

    static int GCD(int a, int b){
        if (a == 0) return b;
        return GCD(b % a, a);
    }
}
