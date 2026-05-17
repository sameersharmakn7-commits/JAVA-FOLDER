import java.util.*;

public class CollectionSize {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();

        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);

        System.out.println("Size of Collection: " + collection.size());
    }
}
