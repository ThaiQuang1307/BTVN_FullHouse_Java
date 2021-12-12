package Exercise_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println(productOf2ver2(0, 2, -65, -42, 2, 1));
        System.out.println(productOf2ver2(0,1,4,5,67,234));
        System.out.println(productOf2ver2(0,-1,-4,-5,-67,-234));
        System.out.println(productOf2ver2(1,4,5,67,234));
        System.out.println(productOf2ver2(-1,-4,-5,-67,-234));
    }

    static int productOf2ver2(int ...args){
        Arrays.sort(args);

        if (args[0] * args[args.length-1] == 0){
            return 0;
        }else if (args[0] * args[args.length-1] < 0){
            return args[0] * args[args.length-1];
        }else {
            if (args[0] > 0){
                int check = 0;
                for (int i = 1; i < args.length; i++) {
                    if (args[i] != args[i-1]){
                        check = i;
                        break;
                    }
                }
                return args[0] * args[check];
            }else {
                int check = args.length-1;
                for (int i = args.length-2; i >= 0; i--) {
                    if (args[i] != args[i+1]){
                        check = i;
                        break;
                    }
                }
                return args[args.length-1] * args[check];
            }
        }
    }
}
