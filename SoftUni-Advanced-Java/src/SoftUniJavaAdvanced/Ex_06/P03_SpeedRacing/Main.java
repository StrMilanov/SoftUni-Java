package SoftUniJavaAdvanced.Ex_06.P03_SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelCostPerKm = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerKm);
            carsMap.put(model, car);
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            // command = Drive {CarModel} {amountOfKm}
            String carToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);


            // Get car
            Car car = carsMap.get(carToDrive);

            if (!car.drive(kmToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }

            command = scanner.nextLine();
        }

        for (Car car: carsMap.values()){
            System.out.println(car.toString());
        }

    }
}
