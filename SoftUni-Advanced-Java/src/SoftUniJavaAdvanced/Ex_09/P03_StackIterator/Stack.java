package SoftUniJavaAdvanced.Ex_09.P03_StackIterator;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.function.Consumer;

public class Stack implements Iterable<Integer> {

    private final Deque<Integer> stack;

    public Stack() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int element) {
        this.stack.push(element);
    }

    public void pop() {
        if (iterator().hasNext()) {
            System.out.println("No elements");
        } else {
            this.stack.pop();
        }
    }

    public void forEachCustom(Consumer<? super Integer> consumer) {
        for (int value : this.stack) {
            consumer.accept(value);
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }
    private class CustomIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return stack.isEmpty();
        }

        @Override
        public Integer next() {
            return stack.peek();
        }
    }

}
