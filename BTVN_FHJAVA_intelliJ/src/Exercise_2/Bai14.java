package Exercise_2;

import java.lang.reflect.Array;
import java.util.*;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (n > 0){
            arr.add(n%10);
            n/=10;
        }
        Collections.sort(arr);
        String output = "";
        for (int i = arr.size()-1; i >= 0; i--) {
            output += arr.get(i);
        }
        System.out.println("Output: " + Integer.parseInt(output));
        sc.close();
    }
}
