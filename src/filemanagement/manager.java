package filemanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alexis on 23/01/17.
 */
public class manager {
    public static Comparable[] getArray(String[] args){
        List<Comparable> listToSort = new ArrayList<>();

        try {
            File x = new File(args[0]);
            Scanner sc = new Scanner(x);

            while(sc.hasNext()) {
                listToSort.add(sc.next());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            System.exit(0);
        }

        Comparable[] arrayToSort = new Comparable[listToSort.size()];
        return listToSort.toArray(arrayToSort);
    }
}
