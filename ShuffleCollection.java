import java.util.*;

public class ShuffleCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        Collections.shuffle(list);

        System.out.println("Shuffled Collection: " + list);
    }
}  
}
