package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        myMap.put("name", "john");
        myMap.put("email", "john@email.com");
        myMap.put("phone", "999999999");

        System.out.println(myMap);

        /*myMap.put("phone", "123456789");

        System.out.println(myMap.get("email"));
        System.out.println(myMap.keySet());
        System.out.println(myMap.containsKey("name"));
        System.out.println(myMap.values());
        System.out.println(myMap);
        */

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("c", 10);
        treeMap.put("b", 5);
        treeMap.put("a", 1);
        System.out.println();
    }

}
