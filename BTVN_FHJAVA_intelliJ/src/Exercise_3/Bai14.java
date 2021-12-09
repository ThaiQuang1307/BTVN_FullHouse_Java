package Exercise_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArr(1,2,3,4,5,6,7)));
    }

    static int[] reverseArr(int ...args){
        int n = args.length;
        for (int i = 0; i < n/2; i++) {
            int temp = args[i];
            args[i] = args[n-1-i];
            args[n-1-i] = temp;
        }
        return args;
    }
}
