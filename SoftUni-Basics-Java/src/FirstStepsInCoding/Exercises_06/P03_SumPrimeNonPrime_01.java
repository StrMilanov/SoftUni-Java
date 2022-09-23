package FirstStepsInCoding.Exercises_06;

import java.util.Scanner;

public class P03_SumPrimeNonPrime_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;
        int counterIfPrime = 0;

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int num = Integer.parseInt(input);

            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    counterIfPrime++;
                }
            }

            if (counterIfPrime > 2) {
                sumNonPrime += num;
            } else {
                sumPrime += num;
            }

            counterIfPrime = 0;
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}
