import sorting.*;
import sorting.sorter;

import java.util.List;

import static filemanagement.manager.getArray;
import static sorting.utils.show;

public class Main {

    public static void main(String[] args) {
        List<Comparable> arrayToSort = getArray(args, "integers");

        show(arrayToSort);

        sorter sorterAlgorithm = new insertion(arrayToSort);

        show(sorterAlgorithm.getArray());

//        TODO: generate random deck
//        long seed = System.nanoTime();
//        Collections.shuffle(arrayToSort, new Random(seed));
    }
}
