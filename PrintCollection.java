import java.util.*;

public class PrintCollection {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Java");
        collection.add("Python");
        collection.add("C++");

        System.out.println("Collection Elements:");

        for(String item : collection) {
            System.out.println(item);
        }
    }
}