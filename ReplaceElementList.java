import java.util.*;

public class ReplaceElementList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        list.set(1, "HTML");

        System.out.println("Updated List: " + list);
    }
}
