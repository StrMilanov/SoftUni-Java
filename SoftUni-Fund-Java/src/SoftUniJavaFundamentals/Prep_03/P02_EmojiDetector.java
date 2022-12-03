package SoftUniJavaFundamentals.Prep_03;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        Map<String, BigInteger> emojiMap = new LinkedHashMap<>();

        String regexCoolThreshold = "[0-9]";
        String regexEmoji = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern patternCT = Pattern.compile(regexCoolThreshold);
        Pattern patternE = Pattern.compile(regexEmoji);

        // EMOJI COOL THRESHOLD
        BigInteger coolThreshold = BigInteger.valueOf(1);
        Matcher matcherCT = patternCT.matcher(inputText);
        while (matcherCT.find()) {
            int nextDigit = Integer.parseInt(matcherCT.group());
            coolThreshold = coolThreshold.multiply(BigInteger.valueOf(nextDigit));
        }

        // POPULATE EMOJI MAP
        Matcher matcherE = patternE.matcher(inputText);
        while (matcherE.find()) {
            String emoji = matcherE.group("emoji");
            BigInteger coolness = BigInteger.valueOf(0);
            for (int i = 0; i < emoji.length(); i++) {
                if (Character.isLetter(emoji.charAt(i))) {
                    coolness = coolness.add(BigInteger.valueOf(emoji.charAt(i)));
                }
            }

            emojiMap.put(matcherE.group(), coolness);
        }


        // OUTPUT
        System.out.printf("Cool threshold: %d\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", emojiMap.size());

        for (Map.Entry<String, BigInteger> entry : emojiMap.entrySet()) {
            if (entry.getValue().intValue() >= coolThreshold.intValue()) {
                System.out.println(entry.getKey());
            }
        }

    }
}
