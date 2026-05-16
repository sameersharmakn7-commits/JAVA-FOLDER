public class InsertString {
    public static void main(String[] args) {

        String original = "Hello World";

        String insert = "Java ";

        String result = original.substring(0, 6) + insert + original.substring(6);

        System.out.println("Result: " + result);
    }
}