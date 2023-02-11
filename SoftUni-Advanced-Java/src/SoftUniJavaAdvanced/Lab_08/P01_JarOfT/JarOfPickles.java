package SoftUniJavaAdvanced.Lab_08.P01_JarOfT;

import java.util.ArrayList;
import java.util.List;

public class JarOfPickles extends Jar<Pickle> {

    private List<Pickle> items;

    public JarOfPickles() {
        this.items = new ArrayList<>();
    }

    public void addItem(Pickle item){
        this.items.add(item);
    }
}
