public class UnicodeCodePoint {
    public static void main(String[] args) {

        String str = "Java";

        int codePoint = str.codePointAt(1);

        System.out.println("Unicode Code Point: " + codePoint);
    }
}
