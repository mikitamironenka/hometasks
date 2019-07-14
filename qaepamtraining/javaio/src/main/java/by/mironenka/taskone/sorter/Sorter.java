package by.mironenka.taskone.sorter;

import java.util.Collections;
import java.util.List;

public class Sorter {

    public Sorter() {
    }

    public static List<Integer> sortAscending(List<Integer> list) {

        Collections.sort(list);
        return list;
    }


}
