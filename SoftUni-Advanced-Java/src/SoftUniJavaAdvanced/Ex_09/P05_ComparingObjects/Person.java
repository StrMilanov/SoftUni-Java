package SoftUniJavaAdvanced.Ex_09.P05_ComparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private int age;
    private String town;

    public Person(String input) {
        String[] data = input.split("\\s+");
        this.name = data[0];
        this.age = Integer.parseInt(data[1]);
        this.town = data[2];
    }

    @Override
    public int compareTo(Person otherPerson) {
        int n = this.name.compareTo(otherPerson.getName());
        if (n == 0) {
            n = Integer.compare(this.age, otherPerson.getAge());
            if (n == 0) {
                n = this.town.compareTo(otherPerson.getTown());
            }
        }
        return n;
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

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
