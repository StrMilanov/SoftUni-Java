package SoftUniJavaFundamentals.Ex_05;

import java.util.*;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arraysList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(arraysList);

        List<String> finalList = new ArrayList<>();
        for (String element : arraysList) {
            String[] tempArray = element.split("\\s+");
            Collections.addAll(finalList, tempArray);
        }

        for (int i = 0; i < finalList.size(); i++) {
            if (finalList.get(i).equals("")) {
                finalList.remove(i);
                i--;
            }
        }

        for (String element : finalList) {
            System.out.print(element + " ");
        }

    }
}
