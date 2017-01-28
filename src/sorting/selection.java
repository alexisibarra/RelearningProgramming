package sorting;

import java.util.List;

import static sorting.utils.isLessThan;
import static sorting.utils.swap;

/**
 * Created by alexis on 23/01/17.
 */
public class selection extends sorter {
    public selection(List<Comparable> aToSort) {
        setArray(aToSort);
        sort(array);
    }

    public void sort(List<Comparable> a) {
        int N = a.size();

        for (int i=0; i < N; i++){
            int min = i;

            for (int j=i+1; j < N; j++)
                if(isLessThan(a.get(j), a.get(min)))
                    min = j;

            swap(a, i, min);
        }
    }
}
