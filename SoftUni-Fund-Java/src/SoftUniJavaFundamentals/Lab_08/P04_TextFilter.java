package SoftUniJavaFundamentals.Lab_08;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordArray = scanner.nextLine().split(",\\s+");
        String text = scanner.nextLine();

        for (String word : banWordArray) {
            int index = text.indexOf(word);
            while (index != -1){
                text = text.replace(word, censor(word));
                index = text.indexOf(word);
            }
        }

        System.out.println(text);
    }


    private static StringBuilder censor(String word){
        StringBuilder censor = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            censor.append("*");
        }
        return censor;
    }

}
