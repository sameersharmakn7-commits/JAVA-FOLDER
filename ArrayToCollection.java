import java.util.*;

public class ArrayToCollection {
    public static void main(String[] args) {

        String arr[] = {"Java", "Python", "C++"};

        Collection<String> collection = Arrays.asList(arr);

        System.out.println("Collection: " + collection);
    }
}
