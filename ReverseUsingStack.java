import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {

        String str = "Java";

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {
            stack.push(ch);
        }

        String rev = "";

        while(!stack.isEmpty()) {
            rev += stack.pop();
        }

        System.out.println("Reversed String: " + rev);
    }
}