package Exercise_3;

import java.util.Arrays;

public class Bai15 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAsc(5,4,3,2,1)));
    }

    static int[] sortAsc(int ...args){
        Arrays.sort(args);
        return args;
    }
}
