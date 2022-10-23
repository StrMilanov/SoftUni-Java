package SoftUniJavaFundamentals.Exam_Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cardsList = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(", ");
            switch (command[0]) {


                case "Add":
                    String cardToAdd = command[1];
                    if (isInDeck(cardToAdd, cardsList)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cardsList.add(cardToAdd);
                        System.out.println("Card successfully added");
                    }
                    break;


                case "Remove":
                    String cardToRemove = command[1];
                    if (isInDeck(cardToRemove, cardsList)) {
                        cardsList.remove(cardToRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Card not found");
                    }
                    break;


                case "Remove At":
                    int indexToRemove = Integer.parseInt(command[1]);
                    if (isIndexInRange(indexToRemove, cardsList)) {
                        cardsList.remove(indexToRemove);
                        System.out.println("Card successfully removed");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;


                case "Insert":
                    int indexToInsert = Integer.parseInt(command[1]);
                    String cardToAddAtIndex = command[2];
                    if (isIndexInRange(indexToInsert, cardsList) && !isInDeck(cardToAddAtIndex, cardsList)) {
                        cardsList.add(indexToInsert, cardToAddAtIndex);
                        System.out.println("Card successfully added");
                    } else if (isIndexInRange(indexToInsert, cardsList) && isInDeck(cardToAddAtIndex, cardsList)) {
                        System.out.println("Card is already added");
                    } else if (!isIndexInRange(indexToInsert, cardsList)) {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        System.out.println(cardsList.toString().replaceAll("[\\[\\]]", ""));

    }

    // --- CHECK IF CARD IS ALREADY IN DECK
    public static boolean isInDeck(String newCard, List<String> deck) {
        boolean isInDeck = false;
        for (String card : deck) {
            if (card.equals(newCard)) {
                isInDeck = true;
                break;
            }
        }
        return isInDeck;
    }


    // --- CHECK IS INDEX IS IN RANGE
    public static boolean isIndexInRange(int index, List<String> deck) {
        return index < deck.size() && index >= 0;
    }


}
