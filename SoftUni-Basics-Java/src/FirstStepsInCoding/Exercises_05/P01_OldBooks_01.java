package FirstStepsInCoding.Exercises_05;

import java.util.Scanner;

public class P01_OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bookWanted = scanner.nextLine();
        boolean bookIsFound = false;
        int counterBooks = 0;

        String bookNext = scanner.nextLine();
        while (!bookNext.equals("No More Books")) {

            if (bookNext.equals(bookWanted)) {
                bookIsFound = true;
                break;
            }

            counterBooks++;
            bookNext = scanner.nextLine();
        }

        if (bookIsFound) {
            System.out.printf("You checked %d books and found it.", counterBooks);
        } else {
            System.out.printf("The book you search is not here!\nYou checked %d books.", counterBooks);
        }

    }

}
