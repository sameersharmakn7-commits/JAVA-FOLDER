public class PangramCheck {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";

        str = str.toLowerCase();

        boolean pangram = true;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            if(str.indexOf(ch) == -1) {
                pangram = false;
                break;
            }
        }

        if(pangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");
    }
}