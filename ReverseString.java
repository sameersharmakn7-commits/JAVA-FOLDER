import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str, rev = "";

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed string: " + rev);
    }
}
