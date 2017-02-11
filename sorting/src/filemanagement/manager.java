package filemanagement;

import sorting.Card;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by alexis on 23/01/17.
 */
public class manager {
    public static List<Comparable> getArray(String[] args, String type){
        List<Comparable> listToSort = new ArrayList<>();

        try {
            File x = new File(args[0]);
            Scanner sc = new Scanner(x);

            while(sc.hasNext()) {
                if (type.equals("cards")){
                    listToSort.add(new Card(sc.next()));
                    continue;
                }

                listToSort.add(Integer.parseInt(sc.next()));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            System.exit(0);
        }

        return listToSort;
    }
}
