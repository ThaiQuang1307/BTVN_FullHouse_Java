package Exercise_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println(productOf2(4, 2, 65, 1, 2, 5));
    }

    static int productOf2(int ...args){
        Arrays.sort(args);
        if (args[0] == 0){
            return 0;
        }else {
            int check = 0;
            for (int i = 1; i < args.length; i++) {
                if (args[i] != args[i-1]){
                    check = i;
                    break;
                }
            }
            return args[0] * args[check];
        }
    }
}
