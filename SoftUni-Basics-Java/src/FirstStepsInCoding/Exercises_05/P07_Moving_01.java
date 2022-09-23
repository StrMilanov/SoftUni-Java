package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P07_Moving_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int availableSpace = w * l * h;

        boolean noMoreSpace = false;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            availableSpace -= boxes;

            if (availableSpace <= 0) {
                noMoreSpace = true;
                break;
            }

            input = scanner.nextLine();
        }

        if (noMoreSpace) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
        } else {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }
    }
}
