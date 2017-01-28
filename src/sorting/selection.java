package sorting;

/**
 * Created by alexis on 23/01/17.
 */
public class selection extends sorter{
    public static void sort(Comparable[] a) {
        int N = a.length;

        for (int i=0; i < N; i++){
            int min = i;

            for (int j=i+1; j < N; j++)
                if(isLessThan(a[j], a[min]))
                    min = j;

            swap(a, i, min);
        }
    }
}
