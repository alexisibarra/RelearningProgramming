import sorting.*;
import sorting.sorter;

import java.util.List;

import static filemanagement.manager.getArray;
import static sorting.utils.show;

public class Main {

    public static void main(String[] args) {

        List<Comparable> arrayToSort = getArray(args);

        show(arrayToSort);

        sorter sorterAlgoritm = new insertion(arrayToSort);

        show(sorterAlgoritm.getArray());
    }
}
