import java.util.*;

public class CompareCollectionElements {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Java");
        collection.add("Python");
        collection.add("Java");

        String element1 = "Java";
        String element2 = "Python";

        if(element1.equals(element2)) {
            System.out.println("Elements are equal");
        } else {
            System.out.println("Elements are not equal");
        }
    }
}