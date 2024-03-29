package SoftUniJavaAdvanced.Lab_07_Workshop.Workshop;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {

    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int size;
    private int capacity;

    public CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }


    private void checkIfEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("CustomStack is empty!");
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            copy[i] = this.data[i];
        }
        this.data = copy;
    }

    private void shrink() {
        this.capacity /= 2;
        int[] copy = new int[this.capacity];

        for (int i = 0; i < this.size; i++) {
            copy[i] = this.data[i];
        }
        this.data = copy;
    }


    // void push(int element) – Adds the given element to the stack
    public void push(int element) {
        if (this.size == this.capacity) {
            resize();
        }
        this.data[this.size] = element;
        this.size++;
    }


    // int pop() – Removes the last added element
    public int pop() {
        checkIfEmpty();

        int element = this.data[this.size - 1];
        this.data[this.size - 1] = 0;
        this.size--;

        if (this.size <= this.capacity / 4) {
            shrink();
        }

        return element;
    }




    // int peek() – Returns the last element in the stack without removing it
    public int peek() {
        checkIfEmpty();

        return this.data[this.size - 1];
    }


    // void forEach(Consumer<Integer> consumer) – Goes through each of the elements in the stack
    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }


}
