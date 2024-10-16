import java.util.ArrayList;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.HashMap;

public class demo2 {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4).forEach(System.out::println);
        Stream.of('a', 2, 3, 4).forEach(System.out::println);
        int []a = {3,4,5,6,7};
       // Stream.of(a).forEach(System.out::println);
        Arrays.stream(a).forEach(System.out::println);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.keySet().forEach(System.out::println);
        map.entrySet().forEach(System.out::println);




    }
}
