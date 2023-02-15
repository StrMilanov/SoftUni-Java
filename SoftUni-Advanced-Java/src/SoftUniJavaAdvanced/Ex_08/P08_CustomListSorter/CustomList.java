package SoftUniJavaAdvanced.Ex_08.P08_CustomListSorter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomList<T extends Comparable<T>> {

    private List<T> elementsList;

    public CustomList() {
        this.elementsList = new ArrayList<>();
    }


    // --- METHODS ---

    public void sort() {
        this.elementsList.sort(Comparable::compareTo);
    }


    public void add(T element) {
        this.elementsList.add(element);
    }

    public T remove(int index) {
        if (index >= 0 && index <= this.elementsList.size()) {
            return this.elementsList.remove(index);
        }
        throw new IndexOutOfBoundsException("Invalid index.");
    }

    public boolean contains(T element) {
        return this.elementsList.contains(element);
    }

    public void swap(int indexOne, int indexTwo) {
        T elementOne = this.elementsList.get(indexOne);
        T elementTwo = this.elementsList.get(indexTwo);
        this.elementsList.set(indexOne, elementTwo);
        this.elementsList.set(indexTwo, elementOne);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : this.elementsList) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return this.elementsList.stream().max(Comparator.naturalOrder()).get();
    }

    public T getMin() {
        return this.elementsList.stream().min(Comparator.naturalOrder()).get();
    }

    public void printList() {
        for (T e : this.elementsList) {
            System.out.println(e);
        }
    }


}
