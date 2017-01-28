package sorting;

import java.util.List;

/**
 * Created by alexis on 23/01/17.
 */
public class utils {
    protected static boolean isLessThan(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    protected static boolean isGreaterThan(Comparable v, Comparable w){
        return !isLessThan(v,w);
    }
    protected static void swap(List<Comparable> a, int i, int j) {
        Comparable t = a.get(i);
        a.set(i, a.get(j));
        a.set(j, t);
    }
    public static void show(List<Comparable> a) {
        for (Comparable anA : a) System.out.print(anA + " ");
            System.out.println();
    }
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (isLessThan(a[i], a[i - 1]))
                return false;
        return true;
    }
}
