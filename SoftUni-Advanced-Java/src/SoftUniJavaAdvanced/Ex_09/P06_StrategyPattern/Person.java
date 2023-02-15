package SoftUniJavaAdvanced.Ex_09.P06_StrategyPattern;

public class Person {

    private String name;
    private int age;

    public Person(String input) {
        String[] data = input.split("\\s+");
        this.name = data[0];
        this.age = Integer.parseInt(data[1]);
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
