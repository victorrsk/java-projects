package datastructures;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println(intList);
        intList.add(2, 10);
        System.out.println(intList);

    }
}
