public class StringToByte {
    public static void main(String[] args) {

        String str = "100";

        byte b = Byte.parseByte(str);

        System.out.println("Byte value: " + b);
    }
}