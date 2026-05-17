import java.util.*;

public class StringToCharacterList {
    public static void main(String[] args) {

        String str = "Java";

        List<Character> list = new ArrayList<>();

        for(char ch : str.toCharArray()) {
            list.add(ch);
        }

        System.out.println(list);
    }
}