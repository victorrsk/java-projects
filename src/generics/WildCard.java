package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WildCard {
    List<?> numbers = new ArrayList<>();
    List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {

        WildCard obj = new WildCard();
        obj.wildCardTesting();
        //obj.receiveList(Arrays.asList("a", "b"));
        obj.receiveList(Arrays.asList(10, 20));
        obj.receiveList(Arrays.asList(12.1, 3.14));
    }

    public void wildCardTesting() {

        this.numbers = integers;
        this.numbers = Arrays.asList(1, 2, 3, 4);
    }

    public void receiveList(List<? extends Number> list) {
        System.out.println(list);
        for (Object number : list) {
            System.out.println(number);
        }
    }
}
