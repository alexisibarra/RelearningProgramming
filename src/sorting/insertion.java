package sorting;

/**
 * Created by alexis on 23/01/17.
 */
public class insertion extends sorter{
    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i=1; i < N; i++){
            int j = i;

            while(j > 0 && isGreaterThan(a[j-1], a[j])){
                swap(a, j-1, j);
                j--;
            }
        }
    }
}
