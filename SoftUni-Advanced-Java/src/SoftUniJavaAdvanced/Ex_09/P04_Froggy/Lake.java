package SoftUniJavaAdvanced.Ex_09.P04_Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lake implements Iterable<Integer>{

    List<Integer> intList;

    public Lake() {
        this.intList = new ArrayList<>();
    }


    public void fill(String string){
        this.intList = Arrays.stream(string.split(",\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }


    public void jump() {
        List<Integer> jumpedOnList = new ArrayList<>();

        IntStream.range(0, this.intList.size()).filter(i -> i % 2 == 0)
                .forEach(i -> jumpedOnList.add(this.intList.get(i)));

        IntStream.range(0, this.intList.size()).filter(i -> i % 2 != 0)
                .forEach(i -> jumpedOnList.add(this.intList.get(i)));

        System.out.println(jumpedOnList.toString().replaceAll("[\\[\\]]",""));
    }


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        for (int num : this.intList) {
            action.accept(num);
        }
    }

}
