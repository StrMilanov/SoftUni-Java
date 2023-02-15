package SoftUniJavaAdvanced.Ex_09.P03_StackIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack();

        String input;

        while (!"END".equals(input = buffReader.readLine())) {
            modify(stack, input.trim().replaceAll(",", "").split("\\s+"));
        }

        stack.forEachCustom(System.out::println);
        stack.forEachCustom(System.out::println);

    }


    private static void modify(Stack stack, String[] data) {
        switch (data[0]) {
            case "Push":
                for (int i = 1; i < data.length; i++) {
                    stack.push(Integer.parseInt(data[i]));
                }
                break;

            case "Pop":
                stack.pop();
                break;
        }
    }

}
