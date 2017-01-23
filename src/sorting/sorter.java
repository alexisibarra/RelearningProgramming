package sorting;

/**
 * Created by alexis on 23/01/17.
 */
public class sorter {
    protected static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }
    protected static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
    public static void show(Comparable[] a) {
     // Print the array, on a single line.
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static boolean isSorted(Comparable[] a)
    { // Test whether the array entries are in order.
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
}
