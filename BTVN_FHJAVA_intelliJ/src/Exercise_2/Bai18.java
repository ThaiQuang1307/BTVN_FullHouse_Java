package Exercise_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str = sc.nextLine();

        Stack<Character> moNgoac = new Stack<Character>();
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                moNgoac.push(str.charAt(i));
            }
            else if (str.charAt(i) == ')'){
                if (moNgoac.size() == 0){
                    check = false;
                    break;
                } else if (moNgoac.pop() == '(')
                    moNgoac.pop();
            }
            else if (str.charAt(i) == ']'){
                if (moNgoac.size() == 0){
                    check = false;
                    break;
                } else if (moNgoac.pop() == '[')
                    moNgoac.pop();
            }
            else if (str.charAt(i) == '}'){
                if (moNgoac.size() == 0){
                    check = false;
                    break;
                } else if (moNgoac.pop() == '{')
                    moNgoac.pop();
            }
        }

        if (moNgoac.size() > 0) check = false;
        if (check) System.out.println("True");
        else System.out.println("False");
        sc.close();
    }
}
