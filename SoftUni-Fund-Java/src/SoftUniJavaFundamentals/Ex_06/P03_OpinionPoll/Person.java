package SoftUniJavaFundamentals.Ex_06.P03_OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }
}
