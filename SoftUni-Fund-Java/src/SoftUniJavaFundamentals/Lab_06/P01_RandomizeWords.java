package SoftUniJavaFundamentals.Lab_06;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = scanner.nextLine().split("\\s+");

        Random rnd = new Random();
        for (int i = 0; i < stringArray.length; i++) {
            int newRndInt = rnd.nextInt(stringArray.length);

            String saveWord = stringArray[newRndInt];
            stringArray[newRndInt] = stringArray[i];
            stringArray[i] = saveWord;
        }

        for (String word : stringArray) {
            System.out.println(word);
        }
    }
}
