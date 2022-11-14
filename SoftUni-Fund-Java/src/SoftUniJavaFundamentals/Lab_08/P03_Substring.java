package SoftUniJavaFundamentals.Lab_08;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String stringToProcess = scanner.nextLine();

        int index = stringToProcess.indexOf(toRemove);
        while (index != -1) {
            stringToProcess = stringToProcess.replace(toRemove,"");
            index = stringToProcess.indexOf(toRemove);
        }

        System.out.println(stringToProcess);
    }
}
