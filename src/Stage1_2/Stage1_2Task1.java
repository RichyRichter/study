package Stage1_2;

import java.util.ArrayList;

public class Stage1_2Task1 {

    public static ArrayList<Integer> getFibonacciArray(int size) {
        ArrayList<Integer> list = new ArrayList(size);
        if (size == 0) { return list;}
        list.add(0);
        if (size > 1) list.add(1);
        for (int i = 2; i < size; ++i) list.add(list.get(i - 2) + list.get(i - 1));
        return list;
    }
}