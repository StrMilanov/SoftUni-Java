package SoftUniJavaAdvanced.Ex_06.P05_CarsSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> enginesList = new ArrayList<>();

        // LOAD ENGINES
        int enginesCount = Integer.parseInt(scanner.nextLine());
        for (int currentEngine = 0; currentEngine < enginesCount; currentEngine++) {
            // "{Model} {Power} {Displacement} {Efficiency}"
            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            int displacement = 0;                                // <-- optional
            String efficiency = null;                            // <-- optional

            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {
                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }
            }


            Engine engine = new Engine(model, power, displacement, efficiency);
            enginesList.add(engine);
        }


        // LOAD CARS
        int carsCount = Integer.parseInt(scanner.nextLine());
        for (int currentCar = 0; currentCar <carsCount; currentCar++) {
            // "{Model} {Engine} {Weight} {Color}"
            String[] carData = scanner.nextLine().split("\\s+");
            String carModel = carData[0];
            String engineModel = carData[1];
            int weight = 0;                                    // <-- optional
            String color = null;                               // <-- optional

            if (carData.length == 4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {
                if (Character.isDigit(carData[2].charAt(0))) {
                    weight = Integer.parseInt(carData[2]);
                } else {
                    color = carData[2];
                }
            }


            Engine carEngine = null;
            for (Engine engine : enginesList) {
                if (engineModel.equals(engine.getModel())){
                    carEngine = engine;
                }
            }

            Car car = new Car(carModel, carEngine, weight, color);
            System.out.print(car.toString());
        }


    }
}
