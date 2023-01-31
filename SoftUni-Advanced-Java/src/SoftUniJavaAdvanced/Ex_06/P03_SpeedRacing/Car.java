package SoftUniJavaAdvanced.Ex_06.P03_SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distanceTravelled;

    // Constructor
    public Car(String model, double fuelAmount, double fuelCostPetKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPetKm;
        this.distanceTravelled = 0;
    }


    public boolean drive(int kmDrive) {
        double needFuel = kmDrive * this.fuelCostPerKm;
        if (needFuel <= this.fuelAmount) {
            this.fuelAmount -= needFuel;
            this.distanceTravelled += kmDrive;
            return true;
        }
        return false;
    }


    @Override
    public String toString(){
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTravelled);
    }

}




