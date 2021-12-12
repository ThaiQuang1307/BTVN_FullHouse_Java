package Exercise_4;

import java.util.Arrays;

public class Bai13 {
    public static void main(String[] args) {
        char[] arr = {'g', 'a', 'z', 'f'};
        System.out.println(Arrays.toString(arr));
        sortCharArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortCharArr(char ...args){
        Arrays.sort(args);
    }
}
