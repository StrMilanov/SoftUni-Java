package SoftUniJavaAdvanced.Lab_08.P02_GenericArrayCreator;

import java.util.ArrayList;
import java.util.List;

public class ArrayCreator {
    public static <T> List<T> create(int length, T item) {

        List<T> array = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            array.add(item);
        }

        return array;
    }
}
