package lambdaTasksMedium;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task2 {
    public static void print(List<Integer> list) {
        Predicate<Integer> predicate = x -> x >= 0;
        Consumer<Integer> consumer = x -> System.out.println(x*2);
        list.stream().filter(predicate).forEach(consumer);
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1, -2, 3, 4, -5, -6, 7, 8, -9, 10);
        print(list);
    }
}
