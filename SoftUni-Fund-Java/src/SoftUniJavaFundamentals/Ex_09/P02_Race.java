package SoftUniJavaFundamentals.Ex_09;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(",\\s+");

        Map<String, Integer> racerMap = new HashMap<>();
        for (String element : inputArray) {
            racerMap.putIfAbsent(element, 0);
        }

        String regexName = "(?<name>[A-Za-z])";
        String regexDistance = "(?<distance>[0-9])";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            // NAME
            Matcher matcherName = patternName.matcher(input);
            StringBuilder name = new StringBuilder();
            while (matcherName.find()) {
                name.append(matcherName.group());
            }

            // DISTANCE
            if (racerMap.containsKey(name.toString())) {
                Matcher matcherDistance = patternDistance.matcher(input);
                int totalDistance = 0;
                while (matcherDistance.find()) {
                    totalDistance += Integer.parseInt(matcherDistance.group());
                }

                racerMap.put(name.toString(), racerMap.get(name.toString()) + totalDistance);
            }

            input = scanner.nextLine();
        }

        // SORT VALUES
        List<Integer> distanceList = new ArrayList<>();
        for (int distance : racerMap.values()) {
            distanceList.add(distance);
        }
        distanceList.sort(Comparator.reverseOrder());

        // PRINT
        String firstPlace = "";
        String secondPlace = "";
        String thirdPlace = "";

        for (Map.Entry<String, Integer> entry : racerMap.entrySet()) {
            if (entry.getValue().equals(distanceList.get(0))) {
                firstPlace = entry.getKey();
            }
            if (entry.getValue().equals(distanceList.get(1))){
                secondPlace = entry.getKey();
            }
            if (entry.getValue().equals(distanceList.get(2))){
                thirdPlace = entry.getKey();
            }
        }

        System.out.println("1st place: " + firstPlace);
        System.out.println("2nd place: " + secondPlace);
        System.out.println("3rd place: " + thirdPlace);
    }
}
