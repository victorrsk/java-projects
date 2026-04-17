package lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        FuncInterface test = Integer::sum;
        test.sum(10, 10);

        Supplier<String> message = () -> "lambda expr";
        System.out.println(message.get());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.forEach(num -> System.out.println(num));

        // PREDICATE
        Predicate<List<Integer>> hasThree = (list_) -> {
            for (Integer num : list_) {
                if (num == 3) {
                    return true;
                }
            }
            return false;
        };

        System.out.println(hasThree.and((list_) -> list_.size() == 4).test(list)); // false
        System.out.println(hasThree.or(list_ -> list_.get(1) == 2).test(list)); // false

        // CONSUMER
        Consumer<List<Integer>> listSizeConsumer = (list_) -> {
            if (list_.size() == 4) {
                System.out.println("List size is 4");
            } else {
                System.out.println("List size is unknown");
            }
        };

        listSizeConsumer.andThen((list_) -> System.out.println("End analysis")).accept(list);

        list.forEach((n) -> {
            System.out.println(n + " plus 2 = " + (n+2));
        });
        System.out.println(list);

        // FUNCTION
        Function<List<Integer>, List<Integer>> toSquare = (list_) -> {
            List<Integer> squareNums = new ArrayList<>();
            for (Integer num : list) {
                squareNums.add(num * num);
            }
            return squareNums;
        };

        System.out.println(toSquare.apply(list));

        // what a mess

        // METHOD REFERENCE
        FuncInterface implement = Integer::sum;
        System.out.println(implement.sum(10, 10));
        list.forEach(System.out::println);
    }
}
