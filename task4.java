package lambdaTasksMedium;

import java.util.List;
import java.util.function.Predicate;

public class task4 {
    public static void print(List<String> list) {
        Predicate<String> predicate1 = s -> s.contains("He");
        Predicate<String> predicate2 = s -> s.length() > 5;
        Predicate<String> predicate3 = predicate1.or(predicate2);
        for (String s : list) {
            if (predicate3.test(s))
                System.out.println(s);
        }
    }
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World","Java","Programming");
        print(list);
    }
}
