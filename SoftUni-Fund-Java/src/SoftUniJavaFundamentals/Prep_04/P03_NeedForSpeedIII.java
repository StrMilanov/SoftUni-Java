package SoftUniJavaFundamentals.Prep_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> carMileageMap = new LinkedHashMap<>();
        Map<String, Integer> carFuelMap = new LinkedHashMap<>();

        // LOAD CAR DATA
        int nCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nCars; i++) {
            String[] inputCarData = scanner.nextLine().split("\\|");
            carMileageMap.put(inputCarData[0], Integer.parseInt(inputCarData[1]));
            carFuelMap.put(inputCarData[0], Integer.parseInt(inputCarData[2]));
        }

        // PLAY
        String actionSplitRegex = "\\s+:\\s+";
        String[] command = scanner.nextLine().split(actionSplitRegex);
        while (!command[0].equals("Stop")) {
            String action = command[0];
            String car = command[1];

            switch (action) {
                case "Drive":
                    int distanceKm = Integer.parseInt(command[2]);
                    int driveFuel = Integer.parseInt(command[3]);

                    if (carFuelMap.get(car) >= driveFuel) {
                        carMileageMap.put(car, carMileageMap.get(car) + distanceKm);
                        carFuelMap.put(car, carFuelMap.get(car) - driveFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distanceKm, driveFuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }

                    if (carMileageMap.get(car) >= 100000) {
                        System.out.printf("Time to sell the %s!\n", car);
                        carMileageMap.remove(car);
                        carFuelMap.remove(car);
                    }
                    break;

                case "Refuel":
                    int availableFuel = Integer.parseInt(command[2]);
                    int requiredFuel = 75 - carFuelMap.get(car);

                    if (availableFuel > requiredFuel) {
                        carFuelMap.put(car, 75);
                        System.out.printf("%s refueled with %d liters\n", car, requiredFuel);
                    } else {
                        carFuelMap.put(car, carFuelMap.get(car) + availableFuel);
                        System.out.printf("%s refueled with %d liters\n", car, availableFuel);
                    }
                    break;

                case "Revert":
                    int kilometers = Integer.parseInt(command[2]);

                    if (carMileageMap.get(car) - kilometers <= 10000) {
                        carMileageMap.put(car, 10000);
                    } else {
                        carMileageMap.put(car, carMileageMap.get(car) - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                    }
                    break;

            }

            command = scanner.nextLine().split(actionSplitRegex);
        }


        // OUTPUT
        for (Map.Entry<String, Integer> entry : carMileageMap.entrySet()) {
            String car = entry.getKey();
            int mileage = entry.getValue();
            int fuel = carFuelMap.get(car);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", car, mileage, fuel);
        }

    }
}
