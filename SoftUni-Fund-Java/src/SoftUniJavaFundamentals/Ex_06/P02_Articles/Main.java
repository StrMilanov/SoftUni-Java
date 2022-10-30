package SoftUniJavaFundamentals.Ex_06.P02_Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(",\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articleList = new ArrayList<>();
        articleList.add(new Article(inputArray[0], inputArray[1], inputArray[2]));

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]) {
                case "Edit":
                    articleList.get(0).setContent(command[1]);
                    break;
                case "ChangeAuthor":
                    articleList.get(0).setAuthor(command[1]);
                    break;
                case "Rename":
                    articleList.get(0).setTitle(command[1]);
                    break;
            }
        }

        System.out.println(articleList.get(0));
    }
}
