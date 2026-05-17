import java.util.*;

public class VectorToList {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");

        List<String> list = new ArrayList<>(vector);

        System.out.println(list);
    }
}
