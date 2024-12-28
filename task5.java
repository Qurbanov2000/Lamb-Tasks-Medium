package lambdaTasksMedium;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;


public class task5 {
    public static void print(Map<Integer,String> map) {
        BiConsumer<Integer,String> consumer = (id, name) -> System.out.println("ID:" + id + " Name:" + name);
        map.forEach(consumer);
    }
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Ali");
        map.put(2,"Bilal");
        map.put(3,"Cefer");
        print(map);
    }
}
