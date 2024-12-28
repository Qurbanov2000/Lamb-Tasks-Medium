package lambdaTasksMedium;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    @FunctionalInterface
    interface Transformer<T> {
        T transform(T input);
    }

    public static void print(List<String> list) {
        Transformer<String> reversing = s -> s=new StringBuilder(s).reverse().toString();
        Transformer<String> uppercase = s -> s.toUpperCase();
        Transformer<String> addSuffix = s -> s + " Any Suffix";

        for (String s : list) {
            s=addSuffix.transform(uppercase.transform(reversing.transform(s)));
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World","Java","Programming");
        print(list);


    }
}
