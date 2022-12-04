package SoftUniJavaFundamentals.Exam_Final;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Exam_Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        Map<String, List<String>> wordsMap = new LinkedHashMap<>();
        String splitRegex = " \\| ";

        // LOAD WORDS & DEFINITIONS
        String[] splitWordsArr = inputString.split(splitRegex);
        for (String entry : splitWordsArr) {
            String entrySplitRegex = ": ";
            String word = entry.split(entrySplitRegex)[0];
            String definition = entry.split(entrySplitRegex)[1];
            wordsMap.putIfAbsent(word, new ArrayList<>());
            wordsMap.get(word).add(definition);
        }

//        // Regex variant (currently has issues with regex formula)
//        String regex = "(?<word>[a-z]+): (?<definition>[A-Za-z0-9., !?-_:;\"']*)";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(inputString);
//        while (matcher.find()) {
//            String word = matcher.group("word");
//            String definition = matcher.group("definition");
//            wordsMap.putIfAbsent(word, new ArrayList<>());
//            wordsMap.get(word).add(definition);
//        }

        // TEST || HAND OVER
        String[] inputWords = scanner.nextLine().split(splitRegex);
        String command = scanner.nextLine();
        switch (command) {

            case "Test":
                for (String testWord : inputWords) {
                    for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
                        if (entry.getKey().equals(testWord)) {
                            System.out.printf("%s:\n", entry.getKey());
                            for (String definition : entry.getValue()) {
                                System.out.printf(" -%s\n", definition);
                            }
                        }

                    }
                }

                break;

            case "Hand Over":
                List<String> handOverList = new ArrayList<>();
                for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
                    String word = entry.getKey();
                    handOverList.add(word);
                }
                System.out.println(String.join(" ", handOverList));
                break;
        }

    }
}

