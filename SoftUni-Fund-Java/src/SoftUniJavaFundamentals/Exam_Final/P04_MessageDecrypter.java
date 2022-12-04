package SoftUniJavaFundamentals.Exam_Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "^([$]|[%])(?<tag>[A-Z][a-z]{2,})\\1(: )((\\[(?<num1>[0-9]+)\\]\\|){3})$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            boolean isFound = false;
            StringBuilder message = new StringBuilder();
            String inputString = scanner.nextLine();
            Matcher matcher = pattern.matcher(inputString);
            while (matcher.find()) {
                isFound = true;
                String tag = matcher.group("tag");
                String nums = matcher.group(4);
                message.append(tag);
                message.append(": ");

                String regexNum = "[0-9]+";
                Pattern patternNums = Pattern.compile(regexNum);
                Matcher matcherNums = patternNums.matcher(nums);

                while (matcherNums.find()) {
                    char ch = (char) (Integer.parseInt(matcherNums.group()));
                    message.append(ch);
                }

            }

            if (isFound) {
                System.out.println(message);
            } else {
                System.out.println("Valid message not found!");
            }

        }

    }
}
