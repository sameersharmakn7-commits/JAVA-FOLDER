public class RemoveLeadingZeros {
    public static void main(String[] args) {

        String str = "0001234";

        str = str.replaceFirst("^0+", "");

        System.out.println("Result: " + str);
    }
}