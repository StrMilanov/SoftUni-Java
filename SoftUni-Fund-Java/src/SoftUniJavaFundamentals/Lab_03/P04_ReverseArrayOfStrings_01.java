package SoftUniJavaFundamentals.Lab_03;

import java.util.Scanner;

public class P04_ReverseArrayOfStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String tempFirst = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = tempFirst;
        }

        System.out.println(String.join(" ", inputArr));
    }
}
