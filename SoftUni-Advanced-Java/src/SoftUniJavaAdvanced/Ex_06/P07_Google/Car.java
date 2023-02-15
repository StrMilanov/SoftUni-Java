package SoftUniJavaAdvanced.Ex_06.P07_Google;

public class Car {

    private String carModel;
    private String carSpeed;

    public Car() {
    }

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }


    @Override
    public String toString() {
        return String.format("%s %s", carModel, carSpeed);
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }

}
