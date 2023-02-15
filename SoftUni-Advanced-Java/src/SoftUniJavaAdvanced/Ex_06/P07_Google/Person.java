package SoftUniJavaAdvanced.Ex_06.P07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private Company company;
    private List<Pokemon> pokemonList;
    private List<Parent> parentList;
    private List<Child> childList;
    private Car car;


    public Person(String name) {
        this.name = name;
        this.pokemonList = new ArrayList<>();
        this.parentList = new ArrayList<>();
        this.childList = new ArrayList<>();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Company:").append(System.lineSeparator());
        if (company != null) {
            sb.append(company).append(System.lineSeparator());
        }

        sb.append("Car:").append(System.lineSeparator());
        if (car != null) {
            sb.append(car).append(System.lineSeparator());
        }

        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemon pokemon : pokemonList) {
            sb.append(pokemon).append(System.lineSeparator());
        }

        sb.append("Parents:").append(System.lineSeparator());
        for (Parent parent : parentList) {
            sb.append(parent).append(System.lineSeparator());
        }

        sb.append("Children:").append(System.lineSeparator());
        for (Child child : childList) {
            sb.append(child).append(System.lineSeparator());
        }

        return sb.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public List<Parent> getParentList() {
        return parentList;
    }

    public void setParentList(List<Parent> parentList) {
        this.parentList = parentList;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
