import java.util.*;

public class CollectionToArray {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Java");
        collection.add("Python");
        collection.add("C++");

        String arr[] = collection.toArray(new String[0]);

        System.out.println("Array Elements:");

        for(String s : arr) {
            System.out.println(s);
        }
    }
}