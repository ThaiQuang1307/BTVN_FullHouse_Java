package Exercise_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("String 1: ");
//        String str1 = sc.nextLine();
//        System.out.print("\nString 2: ");
//        String str2 = sc.nextLine();
//        String str1 = "thai ";
//        String str2 = "quang ";
        // cach 1:
//        String str11 = "";
//        String str12 = "";
//        char[] ch1 = str1.toCharArray();
//        char[] ch2 = str2.toCharArray();
//
//        for(int i = 0; i < ch1.length; i++) {
//            if(!str11.contains(ch1[i] + "")) {
//                str11 += ch1[i];
//            }
//        }
//
//        for(int i = 0; i < ch2.length; i++) {
//            if(!str12.contains(ch2[i] + "")) {
//                str12 += ch2[i];
//            }
//        }
//
//        char[] ch11 = str11.toCharArray();
//        char[] ch12 = str12.toCharArray();
//
//        System.out.print("\nOutput: ");
//        for(int i = 0; i < ch11.length; i++) {
//            for(int j = 0; j < ch12.length; j++) {
//                if(ch11[i] == ch12[j]) {
//                    System.out.print(" '" + ch11[i] + "', ");
//                }
//            }
//        }

        // cach 2:
        System.out.print("String 1: ");
        String name1 = sc.nextLine();
        System.out.print("\nString 2: ");
        String name2 = sc.nextLine();
        ArrayList<String> Output = new ArrayList<String>();
        for (int i = 0; i < name1.length(); i++) {
            String check = name1.substring(i, i+1);
//            System.out.println("Char to check: " + check);
            if (name2.indexOf(check) != -1) {
                if (!Output.contains(check))
                    Output.add(check);
            }
        }
        System.out.print("\n\nOutput: ");
        for (String c : Output) {
            System.out.print(" '" + c + "', ");
        }
        sc.close();
    }
}
