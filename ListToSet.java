import java.util.*;

public class ListToSet {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "Java");

        Set<String> set = new HashSet<>(list);

        System.out.println(set);
    }
}