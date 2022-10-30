package SoftUniJavaFundamentals.Ex_06.P05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split("\\s+");
            Vehicle newVehicle = new Vehicle(inputData[0], inputData[1], inputData[2], Integer.parseInt(inputData[3]));
            vehicleList.add(newVehicle);

            input = scanner.nextLine();
        }

        // --- PRINT VEHICLES ---
        String modelInput = scanner.nextLine();
        while (!modelInput.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (modelInput.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                }
            }

            modelInput = scanner.nextLine();
        }

        // --- AVERAGE HP ---
        double sumHorsepowerCars = 0;
        double sumHorsepowerTrucks = 0;
        int carCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")) {
                sumHorsepowerCars += vehicle.getHorsepower();
                carCount++;
            } else {
                sumHorsepowerTrucks += vehicle.getHorsepower();
                truckCount++;
            }
        }

        double avgCarHP = 0;
        double avgTruckHP = 0;
        if (carCount != 0) {
            avgCarHP = sumHorsepowerCars / carCount;
        } else {
            avgCarHP = 0;
        }
        if (truckCount != 0) {
            avgTruckHP = sumHorsepowerTrucks / truckCount;
        } else {
            avgTruckHP = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.\n", avgCarHP);
        System.out.printf("Trucks have average horsepower of: %.2f.\n", avgTruckHP);

    }
}
