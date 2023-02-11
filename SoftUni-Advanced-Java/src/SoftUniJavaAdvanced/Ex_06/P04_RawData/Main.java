package SoftUniJavaAdvanced.Ex_06.P04_RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> carMap = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            // {Model}
            String model = data[0];

            // {EngineSpeed} {EnginePower}
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            // {CargoWeight} {CargoType}
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            // {TireNPressure} {TireNAge}
            List<Tire> tireList = new ArrayList<>();

            for (int j = 0; j < 8; j += 2) {
                double tirePressure = Double.parseDouble(data[5 + j]);
                int tireAge = Integer.parseInt(data[5 + j + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tireList.add(tire);
            }

            Car car = new Car(model, engine, cargo, tireList);
            carMap.put(model, car);
        }


        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                for (Map.Entry<String, Car> car : carMap.entrySet()) {
                    for (Tire tire : car.getValue().getTireList()) {
                        if (tire.getPressure() < 1) {
                            System.out.println(car.getKey());
                            break;
                        }
                    }
                }

                break;

            // FIXME - Typo in word "flammable"
            case "flamable":
                for (Map.Entry<String, Car> car : carMap.entrySet()) {
                    if (car.getValue().getEngine().getPower() > 250) {
                        System.out.println(car.getKey());
                    }
                }
                break;
        }


    }
}
