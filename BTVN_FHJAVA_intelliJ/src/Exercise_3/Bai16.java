package Exercise_3;

import java.util.Arrays;

public class Bai16 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDec(1,2,3,4,5)));
    }

    static int[] sortDec(int ...args){
        Arrays.sort(args);
        int left = 0;
        int right = args.length - 1;
        while (left < right){
            int temp = args[left];
            args[left] = args[right];
            args[right] = temp;
            left++;
            right--;
        }
        return args;
    }
}
