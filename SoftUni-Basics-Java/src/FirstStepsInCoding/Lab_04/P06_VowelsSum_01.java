package FirstStepsInCoding.Lab_04;

import java.util.Scanner;

public class P06_VowelsSum_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        int totalSum = 0;

        for (int i = 0; i < inputString.length(); i++) {
            switch (inputString.charAt(i)) {
                case 'a':
                    totalSum += 1;
                    break;
                case 'e':
                    totalSum += 2;
                    break;
                case 'i':
                    totalSum += 3;
                    break;
                case 'o':
                    totalSum += 4;
                    break;
                case 'u':
                    totalSum += 5;
                    break;
            }
        }

        System.out.println(totalSum);

    }
}
