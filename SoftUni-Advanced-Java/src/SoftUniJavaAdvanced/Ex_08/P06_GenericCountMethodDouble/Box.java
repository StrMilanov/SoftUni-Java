package SoftUniJavaAdvanced.Ex_08.P06_GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T element : elements) {
            sb.append(element.getClass().getName()).append(": ").append(element).append(System.lineSeparator());
        }

        return sb.toString();
    }


    public void swapPlaces(int indexOne, int indexTwo){
        T elementOne = this.elements.get(indexOne);
        T elementTwo = this.elements.get(indexTwo);
        this.elements.set(indexOne, elementTwo);
        this.elements.set(indexTwo, elementOne);
    }


    public int compare(T element){
        int counter = 0;
        for (T e : this.elements){
            if (e.compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }

}
