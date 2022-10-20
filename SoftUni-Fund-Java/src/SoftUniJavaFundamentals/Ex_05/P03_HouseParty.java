package SoftUniJavaFundamentals.Ex_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            String name = inputLine[0];
            boolean isNotGoing = inputLine[2].equals("not");

            if (isOnList(guestList, name) && !isNotGoing) {
                System.out.println(name + " is already in the list!");
            } else if (isOnList(guestList, name) && isNotGoing){
                guestList.remove(name);
            } else if (!isOnList(guestList, name) && isNotGoing) {
                System.out.println(name + " is not in the list!");
            } else {
                guestList.add(name);
            }

        }

        for (String element : guestList) {
            System.out.println(element);
        }

    }

    public static boolean isOnList(List<String> list, String name) {
        boolean isOnList = false;
        for (String element : list) {
            if (element.equals(name)) {
                isOnList = true;
                break;
            }
        }
        return isOnList;
    }

}
