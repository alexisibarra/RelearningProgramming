package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexis on 28/01/17.
 */
public abstract class sorter {
    List<Comparable> array = new ArrayList<>();

    public List<Comparable> getArray() {
        return array;
    }

    public void setArray(List<Comparable> array) {
        this.array = array;
    }

    abstract void sort(List<Comparable> a);
}
