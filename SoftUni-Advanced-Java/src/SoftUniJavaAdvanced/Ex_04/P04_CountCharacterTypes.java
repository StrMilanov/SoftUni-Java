package SoftUniJavaAdvanced.Ex_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P04_CountCharacterTypes {
    public static void main(String[] args) {

        String inputPath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files\\input.txt";
        String outputPath = "D:\\Coding\\.Projects - InteliJ\\SoftUni-Java\\SoftUni-Advanced-Java\\src\\SoftUniJavaAdvanced\\Ex_04\\files\\output_P04.txt";

        List<Character> vowelMatch = new ArrayList<>(); Collections.addAll(vowelMatch, 'a', 'e', 'i', 'o', 'u');
        List<Character> symbolMatch = new ArrayList<>(); Collections.addAll(symbolMatch, '.', ',', '!', '?');

        int vowels=0; int symbols=0; int other=0;

        try (BufferedReader in = Files.newBufferedReader(Paths.get(inputPath));
             PrintWriter out = new PrintWriter(outputPath)) {

            String line = in.readLine();
            while (line != null) {

                for (int i = 0; i < line.length(); i++) {
                    if (vowelMatch.contains(line.charAt(i))) {
                        vowels++;
                    } else if (symbolMatch.contains(line.charAt(i))) {
                        symbols++;
                    } else if (line.charAt(i) != ' ') {
                        other++;
                    }
                }
                line = in.readLine();
            }

            out.printf("Vowels: %d%nOther symbols: %d%nPunctuation: %d", vowels, other, symbols);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
