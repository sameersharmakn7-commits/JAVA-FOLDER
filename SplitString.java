public class SplitString {
    public static void main(String[] args) {

        String str = "Java Programming";

        String parts[] = str.split(" ");

        for(String s : parts) {
            System.out.println(s);
        }
    }
}