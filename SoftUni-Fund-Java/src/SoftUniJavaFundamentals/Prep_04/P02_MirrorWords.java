package SoftUniJavaFundamentals.Prep_04;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWordPairs = 0;
        Map<String, String> wordsMap = new LinkedHashMap<>();

        String inputString = scanner.nextLine();

        String regex = "([@]|[#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            countWordPairs += 1;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder wordReversed = new StringBuilder(wordOne).reverse();

            if (wordReversed.toString().equals(wordTwo)) {
                wordsMap.put(wordOne, wordTwo);
            }
        }

        // OUTPUT
        if (countWordPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(countWordPairs + " word pairs found!");
        }

        if (wordsMap.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");

            StringBuilder allWords = new StringBuilder();
            for (Map.Entry<String, String> entry : wordsMap.entrySet()) {
                allWords.append(String.format("%s <=> %s|", entry.getKey(), entry.getValue()));
            }

            List<String> allWordsList = new ArrayList<>();
            for (String element : allWords.toString().split("\\|")) {
                allWordsList.add(element);
            }

            System.out.println(String.join(", ", allWordsList));
        }

    }
}
