package SoftUniJavaAdvanced.Ex_06.P05_CarsSalesman;

public class Car {

//A Car has a model, engine, weight, and color

    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //{CarModel}:
        sb.append(this.model).append(":").append(System.lineSeparator());

        //{EngineModel}:
        sb.append(this.engine.getModel()).append(":").append(System.lineSeparator());

        //Power: {EnginePower}
        sb.append("Power: ").append(this.engine.getPower()).append(System.lineSeparator());

        //Displacement: {EngineDisplacement}
        sb.append("Displacement: ");
        if (engine.getDisplacement() == 0) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(engine.getDisplacement()).append(System.lineSeparator());
        }

        //Efficiency: {EngineEfficiency}
        sb.append("Efficiency: ");
        if (engine.getEfficiency() == null) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(engine.getEfficiency()).append(System.lineSeparator());
        }

        //Weight: {CarWeight}
        sb.append("Weight: ");
        if (this.weight == 0){
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.weight).append(System.lineSeparator());
        }

        //Color: {CarColor}
        sb.append("Color: ");
        if (this.color == null){
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.color).append(System.lineSeparator());
        }

        return sb.toString();
    }

}
