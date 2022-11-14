package SoftUniJavaFundamentals.Ex_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNum = scanner.nextLine().replaceAll("^0+(?!$)", "");

        int[] inputNumArr = Arrays.stream(inputNum.split("")).mapToInt(Integer::parseInt).toArray();
        int multiplier = Integer.parseInt(scanner.nextLine());

        List<Integer> productNumList = new ArrayList<>();

        int remaining = 0;

        if (multiplier == 0 || inputNumArr[0] == 0) {
            System.out.println(0);
        } else {

            for (int i = inputNumArr.length - 1; i >= 0; i--) {
                int multiplyCurrentNum = inputNumArr[i] * multiplier + remaining;
                if (multiplyCurrentNum >= 10) {
                    remaining = multiplyCurrentNum / 10;
                    int digit = multiplyCurrentNum % 10;
                    productNumList.add(0, digit);
                } else {
                    productNumList.add(0, multiplyCurrentNum);
                    remaining = 0;
                }
            }

            if (remaining != 0) {
                productNumList.add(0, remaining);
            }

            System.out.println(productNumList.toString().replaceAll("[\\[\\], ]", ""));
        }

    }
}
