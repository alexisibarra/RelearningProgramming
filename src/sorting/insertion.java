package sorting;

import java.util.List;

import static sorting.utils.isGreaterThan;
import static sorting.utils.swap;

/**
 * Created by alexis on 23/01/17.
 */
public class insertion extends sorter {
    public insertion(List<Comparable> aToSort) {
        setArray(aToSort);
        sort(array);
    }

    public void sort(List<Comparable> a) {
        int N = a.size();

        for (int i=1; i < N; i++){
            int j = i;

            while(j > 0 && isGreaterThan(a.get(j - 1), a.get(j))){
                swap(a, j-1, j);
                j--;
            }
        }
    }
}
