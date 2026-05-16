import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        String octal = Integer.toOctalString(num);

        System.out.println("Octal value: " + octal);
    }
}
