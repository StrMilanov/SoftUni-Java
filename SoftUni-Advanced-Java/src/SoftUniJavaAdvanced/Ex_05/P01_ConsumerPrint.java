package SoftUniJavaAdvanced.Ex_05;

import java.util.Scanner;
import java.util.function.Consumer;

public class P01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

//        // v1
//        Arrays.stream(names).forEach(e -> System.out.println(e));

        //v2
        Consumer<String> printName = name -> System.out.println(name);

        for (String name : names) {
            printName.accept(name);
        }
    }
}
