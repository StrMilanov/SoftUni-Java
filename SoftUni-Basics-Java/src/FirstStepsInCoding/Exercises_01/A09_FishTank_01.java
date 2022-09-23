package FirstStepsInCoding.Exercises_01;

import java.util.Scanner;

public class A09_FishTank_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        double percentEquipment = Double.parseDouble(scanner.nextLine());

        double aquariumDm = (lengthCm * widthCm * heightCm) / 1000.00;        // 1dm = 10cm

        double equipmentDm = aquariumDm * (percentEquipment / 100.00);

        System.out.println(aquariumDm - equipmentDm);
    }
}
