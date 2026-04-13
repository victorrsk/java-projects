package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("a");
        mySet.add("a");
        mySet.add("b");
        mySet.add("c");


        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(10);
        myTreeSet.add(4);
        myTreeSet.add(1);

        System.out.println(myTreeSet);

        Set<Integer> myLinkHashSet = new LinkedHashSet<>();
        myLinkHashSet.add(1);
        myLinkHashSet.add(2);
        myLinkHashSet.add(3);
    }
}
