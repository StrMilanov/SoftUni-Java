package SoftUniJavaFundamentals.Lab_06.P06_Students2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String newHometown) {
        this.hometown = newHometown;
    }

    public String toString() {
        return String.format("%s %s is %d years old", firstName, lastName, age);
    }

}
