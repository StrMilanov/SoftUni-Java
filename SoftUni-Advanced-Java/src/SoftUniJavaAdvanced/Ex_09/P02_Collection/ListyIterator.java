package SoftUniJavaAdvanced.Ex_09.P02_Collection;

import java.util.List;

public class ListyIterator {

    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.isEmpty()) {
            this.index = -1;
        } else {
            this.index = 0;
        }
    }


    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean move() {
        if (this.index < this.data.size() - 1) {
            this.index++;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNext() {
        return this.index < this.data.size() - 1;
    }

    public void print() {
        if (this.data.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.data.get((this.index)));
        }
    }


    public void printAll() {
        int counter = 0;
        while (counter != this.data.size()) {
            System.out.print(this.data.get(counter) + " ");
            counter++;
        }
        System.out.println();
    }


}
