import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        List<String> list = List.of("I", "am", "a","list","of","Strings");
        Stream<String> stream = list.stream();
        Stream<String> limit = stream.limit(4);
        limit.forEach(s -> System.out.println(s));

    }
}