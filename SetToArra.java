import java.util.*;

public class SetToArra {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");

        String arr[] = set.toArray(new String[0]);

        for(String s : arr) {
            System.out.println(s);
        }
    }
}
