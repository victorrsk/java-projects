package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("joao");
        list.add("ana");
        list.add("pedro");

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);

        Stream<String> stream = list.stream();
        stream.map(name -> {return name + " map";}).forEach(System.out::println);

        Stream<Integer> streamInt = listInt.stream();
        System.out.println(streamInt.mapToInt(num -> {return num + 0;}));

        Stream<Integer> integers = Stream.of(2, 1);
        System.out.println(integers.min(Integer::compare));
    }
}
