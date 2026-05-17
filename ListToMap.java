import java.util.*;

public class ListToMap {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Python", "C++");

        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++) {
            map.put(i, list.get(i));
        }

        System.out.println(map);
    }
}
