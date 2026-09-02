import java.util.Scanner;
public class GLW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("EQUAL");
        } else if(a>b) {
            System.out.println("GREATER");
        } else {
            System.out.println("LESSER");
        }
    }
}