package Exercise_4;

public class Bai9 {
    public static void main(String[] args) {
        System.out.println(findLongestString("trinh thai quang"));
    }

    static String findLongestString(String s){
        s = s.replaceAll("\\s\\s+", " ").strip();
        String[] arr = s.split(" ");
        String max = arr[0];
        for (String i : arr) {
            if (i.length() > max.length()){
                max = i;
            }
        }
        return max;
    }
}
