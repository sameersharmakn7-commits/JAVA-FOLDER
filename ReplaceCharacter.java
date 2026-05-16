public class ReplaceCharacter {
    public static void main(String[] args) {

        String str = "Java";

        String newStr = str.substring(0, 2) + 'X' + str.substring(3);

        System.out.println("New String: " + newStr);
    }
}
