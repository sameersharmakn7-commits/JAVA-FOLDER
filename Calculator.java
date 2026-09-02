import java .util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.nextDouble();
        switch (operator) {
            case'+':
            System.out.println("Result = " + (num1 + num2));
            break:
            case '/':
                if (num2 !=0)
                      System.out.println("Result = "+ (num1 /num2));
                    else
                    
                    System.out.println("Cannot divide by zero.");
                    break;
                    default:
                          System.out.println("Invalid operator !");
}
sc.close();


    }
    
}
