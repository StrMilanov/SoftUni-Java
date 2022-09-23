package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P03_SumNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMain = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int numNew = 0;

        while (sum < numMain) {
            numNew = Integer.parseInt(scanner.nextLine());
            sum += numNew;
        }

        System.out.println(sum);

    }
}
