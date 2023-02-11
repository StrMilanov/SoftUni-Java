package SoftUniJavaAdvanced.Ex_06.P04_RawData;

import java.util.List;

public class Car {

    // model, engine, cargo, and a collection of exactly 4 tires
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tireList;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tireList) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tireList = tireList;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tire> getTireList() {
        return tireList;
    }

    public void setTireList(List<Tire> tireList) {
        this.tireList = tireList;
    }
}
