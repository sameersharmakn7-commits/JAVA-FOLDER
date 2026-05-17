import java.util.*;

public class ReverseCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Collections.reverse(list);

        System.out.println("Reversed Collection: " + list);
    }
}
