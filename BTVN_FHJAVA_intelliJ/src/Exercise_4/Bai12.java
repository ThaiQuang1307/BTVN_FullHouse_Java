package Exercise_4;

import java.util.Arrays;

public class Bai12 {
    public static void main(String[] args){
        int[] arr = {4, 2, 6, 1, 2, 76};
        System.out.println(findMaxAt(arr, 2));
    }

    static int findMaxAt(int[] arr, int n) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        int outPut = arr2[arr2.length-1];
        int Count = 1;
        int i = arr2.length-2;
        while (i >= 0){
            if (arr2[i] != arr2[i+1]){
                    Count++;
            }
            if (Count == n) {
                outPut = arr2[i];
                break;
            }
            i--;
        }
        return outPut;
    }
}
