package SoftUniJavaAdvanced.Ex_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07_SimpleTextEditor_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> textStack = new ArrayDeque<>();
        ArrayDeque<String> actionStack = new ArrayDeque<>();


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String inputString = scanner.nextLine();
            int command = Integer.parseInt(inputString.split(" ")[0]);

            if (command == 4) {
                if (!actionStack.isEmpty()) {
                    inputString = actionStack.pop();
                }
            }

            String arg = inputString.split(" ")[1];
            switch (command) {
                case 1:
                    actionStack.push(inputString);
                    for (char c : arg.toCharArray()) {
                        textStack.push(c);
                    }
                    break;

                case 2:
                    actionStack.push(inputString);
                    int count = Integer.parseInt(arg);
                    for (int j = 0; j < count; j++) {
                        if (!textStack.isEmpty()) {
                            textStack.pop();
                        }
                    }
                    break;

                case 3:
                    int index = Integer.parseInt(arg);
                    ArrayDeque<Character> textStackClone = textStack.clone();
                    char element = 'a';
                    for (int j = 0; j < index; j++) {
                        if (!textStackClone.isEmpty()) {
                            element = textStackClone.removeLast();
                        }
                    }
                    System.out.println(element);
                    break;


            }

        }

    }
}
