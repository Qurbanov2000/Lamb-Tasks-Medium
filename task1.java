package lambdaTasksMedium;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class task1 {

    public static void checkAndPrint(List<String> list) {
        Predicate<String> predicate1 = s -> s.charAt(0)=='A' || s.charAt(0)=='a';
        Predicate<String> predicate2 = s -> s.charAt(s.length()-1)=='Z' || s.charAt(s.length()-1)=='z';

        for (String s : list) {
            if (predicate1.test(s) && predicate2.test(s))
                System.out.println(s);
        }

    }
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Ariz","Fariz","Teyyare","Analiz");
        checkAndPrint(list);
    }
}
