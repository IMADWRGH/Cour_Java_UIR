package List;

import java.util.Collections;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
//      List <String> fruits = new ArrayList<>();
//        fruits.add("Banana");
//        fruits.add("Apple");
//        fruits.add("mango");
//        fruits.add("orange");
//        fruits = Collections.unmodifiableList(fruits);
//        fruits.forEach(System.out::println);

        List<String> list= List.of("A","B","C");
        List<String> list2= Arrays.asList("A","B","C");
        list2.set(0,"D");
        System.out.println(list2);
//        list.set(0,"D");
        list.forEach(e->System.out.println(e));
    }
}
