import java.util.Scanner;
public class BUTTON {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if (button == 1) {
            System.out.println("SAMEER");
        } else if(button == 2) {
            System.out.println("SHARMA");
        } else if(button == 3) {
            System.out.println("KUMAR");
        } else {
            System.out.println("INVALID BUTTON");
        }
    }
}
        
        