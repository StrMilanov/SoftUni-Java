package SoftUniJavaAdvanced.Ex_09.P04_Froggy;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Lake lake = new Lake();

        String input = scanner.nextLine();
        lake.fill(input);

        lake.jump();

    }
}
