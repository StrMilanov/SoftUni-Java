package SoftUniJavaFundamentals.Ex_03;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numSum = Integer.parseInt(scanner.nextLine());

        for (int mainNum = 0; mainNum <= numArray.length - 1; mainNum++) {

            for (int otherNum = mainNum + 1; otherNum <= numArray.length - 1; otherNum++) {

                if (numArray[mainNum] + numArray[otherNum] == numSum){
                    System.out.println(numArray[mainNum] + " " + numArray[otherNum]);
                }

            }

        }

    }
}
