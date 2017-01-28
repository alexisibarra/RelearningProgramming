package sorting;

/**
 * Created by alexis on 23/01/17.
 */
public class sorter {
    protected static boolean isLessThan(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    protected static boolean isGreaterThan(Comparable v, Comparable w){
        return !isLessThan(v,w);
    }
    protected static void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
    public static void show(Comparable[] a) {
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
