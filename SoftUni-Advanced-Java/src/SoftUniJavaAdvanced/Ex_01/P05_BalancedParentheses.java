package SoftUniJavaAdvanced.Ex_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> charStack = new ArrayDeque<>();
        char[] inputCharArray = scanner.nextLine().toCharArray();
        boolean isEqual = false;

        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] == '[' || inputCharArray[i] == '(' || inputCharArray[i] == '{') {
                charStack.push(inputCharArray[i]);
            } else {
                if (inputCharArray[i] == ']' || inputCharArray[i] == ')' || inputCharArray[i] == '}') {
                    char right = inputCharArray[i];
                    char left = 'a';
                    if (!charStack.isEmpty()) {
                        left = charStack.pop();
                    } else {
                        isEqual = false;
                        break;
                    }

                    if (left == '[' && right == ']') {
                        isEqual = true;
                    } else if (left == '(' && right == ')') {
                        isEqual = true;
                    } else if (left == '{' && right == '}') {
                        isEqual = true;
                    } else {
                        isEqual = false;
                        break;
                    }

                }
            }
        }


        if (isEqual) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
