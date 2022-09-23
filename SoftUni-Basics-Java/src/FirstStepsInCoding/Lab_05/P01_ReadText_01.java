package FirstStepsInCoding.Lab_05;

import java.util.Scanner;

public class P01_ReadText_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            System.out.println(input);
            input = scanner.nextLine();
        }

    }
}
