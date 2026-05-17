import java.util.*;

public class CompareElements {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Java");
        collection.add("Python");

        String str1 = "Java";
        String str2 = "Python";

        if(str1.equals(str2)) {
            System.out.println("Elements are equal");
        } else {
            System.out.println("Elements are not equal");
        }
    }
}
