import java.util.*;
import java.util.stream.*;

public class ListToStream {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C++");

        Stream<String> stream = list.stream();

        stream.forEach(System.out::println);
    }
}
