package Exercise_4;

public class Bai14 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 1, 5, 2, 4};
        System.out.println(findAnElement(arr, 5));
    }

    static boolean findAnElement(int[] arr, int n){
        for (int i : arr) {
            if (i == n){
                return true;
            }
        }
        return false;
    }
}
