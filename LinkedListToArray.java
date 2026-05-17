import java.util.*;

public class LinkedListToArray {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        String arr[] = list.toArray(new String[0]);

        for(String s : arr) {
            System.out.println(s);
        }
    }
}