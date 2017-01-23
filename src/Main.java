import static filemanagement.manager.getArray;

public class Main {

    public static void main(String[] args) {

        Comparable[] arrayToSort = getArray(args);

        sorting.selection.show(arrayToSort);

        sorting.selection.sort(arrayToSort);

        sorting.selection.show(arrayToSort);
        assert sorting.selection.isSorted(arrayToSort);
    }
}
